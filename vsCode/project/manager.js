

//회원의 정보 : 아이디,비밀번호,이름
//member -> 생성자 함수를 정의

function Member(id, pw, name) {
    this.userid = id;
    this.pw = pw;
    this.username = name;
}
//객체가 가지는 메소드는 공통으로 사용 -> prototype
Member.prototype.makeHtml = function () {
    return '[id:' + this.userId + ' ,pw: ' + this.pw + ',name:' + this.userName + ' ]'
};
////////////////////////////////////////////////////

//회원의 정보를 저장하는 배열
var members = []; // new Array()

//배열 -> json(문자열) -> localstorage 저장
// 저장 
// 수정
// 삭제
// setItem('members',jSON.stringfy(members))

///////////////////////////////////////////////

//사용자가 입력한 정보를 가지고 Member객체를 생성
//submit 이벤트 연결

window.onload = function () {

    //localStorage 저장된 데이터가 있는지 확인
    //localStorage.getItem('members') 없으면 null 반환
    if (localStorage.getItem('members') == null) {
        // 배열 members를 저장
        localStorage.setItem('members', JSON.stringify(members));
    } else {
        //JSON 문자열 -> 객체로 변환
        members = JSON.parse(localStorage.getItem('members'));
        console.log(members);
        //테이블 세팅
        setList();
    }
    // querySelector :
    // getElementById : 
    var userid = document.querySelector('#userID');
    var pw = document.querySelector('#pw');
    var repw = document.querySelector('#repw');
    var userName = document.querySelector('#userName');

    //regForm 캐스팅
    var regForm = document.getElementById('regForm');
    regForm.onsubmit = function () {

        //사용자가 입력한 값
        // var userid = document.querySelector('#userID').value;
        // var pw = document.querySelector('#pw').value;
        // var repw = document.querySelector('#repw').value;
        // var name = document.querySelector('#userName').value;

        //유효성 검사
        //아이디 공백체크
        if (userid.value.trim().length < 1) {
            // alert('이름을 입력해주세요.');
            document.querySelector('#userID+div.msg').innerHTML = '필수 항목입니다.';
            document.querySelector('#userID+div.msg').style.display = 'block';
            return false;
        }
        //비밀번호 공백체크
        if (pw.value.trim().length < 1) {
            // alert('비밀번호를 입력해주세요.');
            document.querySelector('#pw+div.msg').innerHTML = '필수 항목입니다.';
            document.querySelector('#pw+div.msg').style.display = 'block';
            return false;
        }

        //비밀번호 확인 공백체크
        if (repw.value.trim().length < 1) {
            // alert('비밀번호를 입력해주세요.');
            document.querySelector('#repw+div.msg').innerHTML = '필수 항목입니다.';
            document.querySelector('#repw+div.msg').style.display = 'block';
            return false;
        }

        // 비밀번호 비밀번호 확인 일치 여부 체크 
        if (pw.value.trim() != repw.value.trim()) {
            // alert('비밀번호와 비밀번호확인과 일치하지 않습니다.\n 다시확인해주세요.');
            document.querySelector('#repw+div.msg').innerHTML = '비밀번호가 일치하지 않습니다..';
            document.querySelector('#repw+div.msg').style.display = 'block';
            // repw.value = '';
            return false;
        }

        //사용자 이름 정보 공백체크
        if (userName.value.trim() < 1) {
            // alert('이름을 입력해주세요.');
            document.querySelector('#userName+div.msg').innerHTML = '필수 항목입니다.';
            document.querySelector('#userName+div.msg').style.display = 'block';
            return false;
        }

        console.log(userid.value);
        console.log(pw.value);
        console.log(repw.value);
        console.log(userName.value);
        //객체 생성
        // var member = new Member(userid.value,pw.value,name.value);

        // console.log(typeof member, member.makeHtml());

        //배열에 사용자 정보를 추가
        members.push(new Member(userid.value, pw.value, userName.value));

        // 저장
        // localStorage.setItem('members', JSON.stringify(members));

        alert('등록되었습니다.');
        console.log('회원리스트', members);

        //form 초기화
        this.reset();

        //테이블 세팅
        setList();

        return false;
    }
    //커서가 해당 영역에 위치할때 박스를 숨기는 이벤트
    userid.addEventListener('focus', function () {
        document.querySelector('#userID+div.msg').style.display = 'none';
        document.querySelector('#userID+div.msg').innerHTML = '';
    });

    pw.addEventListener('focus', function () {
        document.querySelector('#pw+div.msg').style.display = 'none';
        document.querySelector('#pw+div.msg').innerHTML = '';
    });
    repw.addEventListener('focus', function () {
        document.querySelector('#repw+div.msg').style.display = 'none';
        document.querySelector('#repw+div.msg').innerHTML = '';
        repw.value = '';
    });

    userName.addEventListener('focus', function () {
        document.querySelector('#userName+div.msg').style.display = 'none';
        document.querySelector('#userName+div.msg').innerHTML = '';
    });
}

//배열에 있는 요소를 -> table tr 행을 만들어서 출력 
function setList() {

    console.log(members);
    console.log(JSON.stringify(members));
    localStorage.setItem('members',JSON.stringify(members));

    //table -> tbody 캐스팅
    var list = document.querySelector('#list');

    var tbody = '<tr>';
    tbody += '  <th>순번(index)</th>';
    tbody += '  <th>아이디</th>';
    tbody += '  <th>비밀번호</th>';
    tbody += '  <th>이름</th>';
    tbody += '  <th>관리</th>';
    tbody += '</tr>';

    if (members.length < 1) {

        tbody += '<tr>';
        tbody += '  <td colspan = "5">데이터가 존재하지 않습니다.</td>'
        tbody += '</tr>';

    } else {

        for (var i = 0; i < members.length; i++) {
            tbody += '<tr>';
            tbody += '  <td>' + i + '</td>';
            tbody += '  <td>' + members[i].userid + '</td>';
            tbody += '  <td>' + members[i].pw + '</td>';
            tbody += '  <td>' + members[i].username + '</td>';
            tbody += '  <td><a href="javascript:editMember(' + i + '); ">수정</a> | <a href="javascript:deleteMember(' + i + ');">삭제</a></td>';
            tbody += '</tr>';
        }
    }
    list.innerHTML = tbody;
}

//배열의 요소 삭제 함수
function deleteMember(index) {
    //alert(index + '인덱스의 요소를 삭제합니다.');

    // var chk = confirm('삭제하시겠습니까?');

    //배열의  index 요소를 삭제
    //splice(index,count) : index에서 시작해서 count 만큼의 요소를 삭제하고 남은 요소의 배열을 반환
    //splice(index, 1)
    if (confirm('삭제하시겠습니까?')) {
        members.splice(index, 1);
        alert('삭제되었습니다.');

        // 저장
        localStorage.setItem('members', JSON.stringify(members));

        //테이블 리스트를 갱신
        setList();
    }
}

//배열의 요소 수정 함수
function editMember(index) {

    //수정 폼 영역이 노출되어야 한다.
    document.querySelector('#editFormArea').style.display = 'block';

    // alert(index + '인덱스의 요소를 수정합니다.');

    //전달받은 index 값으로 members 배열의 객체 하나를 얻을 수 있다.
    console.log(index, members[index]);

    //editForm의 태그들의 value값을 세팅
    var editUserId = document.querySelector('#editID');
    var editPw = document.querySelector('#editPw');
    var editRePw = document.querySelector('#editRePw');
    var editName = document.querySelector('#editName');
    var editIndex = document.querySelector('#index');

    //이전 데이터를 폼에 세팅
    editUserId.value = members[index].userid;
    editPw.value = members[index].pw;
    editRePw.value = members[index].repw;
    editName.value = members[index].userName;
    editIndex.value = index;

    document.querySelector('#editForm').onsubmit = function () {
        // var member = new Member(editUserId.value,editPw.value,editName.value);

        // console.log(editIndex.value,member);

        //비밀번호와 비밀번호 확인이 같은지 체크
        if (editPw.value != editRePw.value) {
            alert('비밀번호와 비밀번호 확인이 일치하지 않습니다.');
            return false;
        }

        if (!confirm('수정하시겠습니까?')) {
            return false;
        };

        members[editIndex.value].pw = editPw.value;
        members[editIndex.value].userName = editName.value;

        //저장
        localStorage.setItem('members', JSON.stringify(members));

        alert('수정되었습니다.');
        editMemberClose();
        setList();

        return false;
    };

}

//수정완료,닫기 버튼 기능
function editMemberClose() {
    document.querySelector('#editFormArea').style.display = 'none';
}
