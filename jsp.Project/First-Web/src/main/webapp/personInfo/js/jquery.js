//회원의 정보 : 아이디,비밀번호,이름
//member -> 생성자 함수를 정의
function Member(id, pw, name) {
    this.userid = id;
    this.pw = pw;
    this.username = name;
}

//회원의 정보를 저장하는 배열
var members = []; // new Array()
//아이디유효성 검사
//id -> 이메일 형식 
var id_reg = RegExp(/^[a-z0-9_+.-]+@([a-z0-9-]+\.)+[a-z0-9]{2,4}$/);
//비밀 번호 영소,대문자로 6-20자 이하로 최소 1개의 숫자 혹은 특수문자 포함
var pw_reg = RegExp(/^(?=.*[a-zA-Z])((?=.*\d)|(?=.*\W)).{6,20}$/ );
//사용자 이름 :한글만 가능
var name_reg = RegExp(/^[가-힣]+$/);

//사용자가 입력한 정보를 가지고 Member객체를 생성
$(document).ready(function () {
    //localStorage 저장된 데이터가 있는지 확인
    //localStorage.getItem('members') 없으면 null 반환
    if (localStorage.getItem('members') == null) {
        // 배열 members를 저장
        localStorage.setItem('members', JSON.stringify(members));
    } else {
        //JSON 문자열 -> 객체로 변환
        members = JSON.parse(localStorage.getItem('members'));
        // console.log(members);
        //테이블 세팅
        setList();
    }


    //regForm 캐스팅
    $('#regForm').submit(function () {
        var id = $('#userID').val();
        var pw = $('#pw').val();
        var repw = $('#repw').val();
        var username = $('#userName').val();

        //아이디 공백체크
        if (id.trim().length < 1) {
            $('#userID + div.msg').css('display', 'block').html('필수 항목입니다.');
            return false;
        }
        //아이디 조건 체크
        if (!id_reg.test(id)) {
            $('#userID + .msg').css('display', 'block').html('id는 이메일형식으로 입력하세요.');
            return false;
        }
        //비밀번호 공백체크
        if (pw.trim().length < 1) {
            $('#pw + .msg').html('필수 항목입니다.').css('display', 'block');
            return false;
        }
        //비밀번호 유효성 체크
        if (!pw_reg.test(pw)) {
            $('#pw + .msg').css('display', 'block').html('pw는6-20자 이하로 영문자로 시작, 최소 1개 숫자 혹은 특수문자를 입력해주세요.');

            return false
        }
        //비밀번호 확인 공백체크
        if (repw.trim().length < 1) {
            $('#repw + .msg').html('필수 항목입니다.').css('display', 'block');
            return false;
        }
        // 비밀번호 비밀번호 확인 일치 여부 체크 
        if (pw.trim() != repw.trim()) {
            $('#repw + .msg').css('display', 'block').html('비밀번호가 일치하지 않습니다.');
            return false;
        }
        //사용자 이름 정보 공백체크
        if (username.trim() < 1) {
            $('#userName + .msg').html('필수 항목입니다.').css('display', 'block');
            return false;
        }
        // 사용자이름 유효성 체크
        if (!name_reg.test(username)) {
            $('#userName + .msg').css('display', 'block').html('이름은 한글만 입력 가능합니다.');
            return false;
        }

        //배열에 사용자 정보를 추가
        members.push(new Member(id, pw, username));

        // 저장
        localStorage.setItem('members', JSON.stringify(members));

        alert('등록되었습니다.');
        console.log('회원리스트', members);

        //form 초기화
        this.reset();

        //테이블 세팅
        setList();

        return false;

    });
    //커서가 해당 영역에 위치할때 박스를 숨기는 이벤트
    $('#userID').on('focus', function () {
        $('#userID+div.msg').css('display', 'none');
    });

    $('#pw').on('focus', function () {
        $('#pw+div.msg').css('display', 'none');
    });
    $('#repw').on('focus', function () {
        $('#repw+div.msg').css('display', 'none');
    });

    $('#userName').on('focus', function () {
        $('#userName+div.msg').css('display', 'none');
    });

});

//배열에 있는 요소를 -> table tr 행을 만들어서 출력 
function setList() {

    // console.log(members);
    // console.log(JSON.stringify(members));
    localStorage.setItem('members', JSON.stringify(members));

    //table -> tbody 캐스팅
    var list = $('#list');

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
    list.html(tbody);
}

//배열의 요소 삭제 함수
function deleteMember(index) {
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

    //수정버튼 클릭시 화면에 보여준다.
    $('#editFormArea').css('display', 'block');

    //editForm의 태그 캐스팅 -> 이전 데이터를 폼에 세팅
    $('#editID').val(members[index].userid);
    $('#editPw').val(members[index].pw);
    $('#editRePw').val(members[index].pw);
    $('#editName').val(members[index].username);
    $('#index').val(index);

    $('#editForm').submit(function () {
        //비밀번호 유효성 체크
        if (!pw_reg.test($('#editPw').val())) {
            alert('6-20자의 영문자와 최소 1개의 숫자 혹은 특수문자를 입력하세요.');
            return false;
        }
        //비밀번호와 비밀번호 확인이 같은지 체크
        if ($('#editPw').val() != $('#editRePw').val()) {
            alert('비밀번호와 비밀번호 확인이 일치하지 않습니다.');
            return false;
        }
        if (!name_reg.test($('#editName').val())) {
            alert('이름은 한글만 가능합니다.');
            return false;
        }

        if (!confirm('수정하시겠습니까?')) {
            return false;
        };

        members[$('#index').val()].pw = $('#editPw').val();
        members[$('#index').val()].username = $('#editName').val();

        //저장
        localStorage.setItem('members', JSON.stringify(members));

        alert('수정되었습니다.');
        editMemberClose();
        setList();

        return false;
    });

}

//수정완료,닫기 버튼 기능
function editMemberClose() {
    $('#editFormArea').css('display', 'none');
}
