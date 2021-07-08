

//회원의 정보 : 아이디,비밀번호,이름
//member -> 생성자 함수를 정의

function Member(id,pw,name) {
    this.userId = id;
    this.pw = pw;
    this.userName = name;
}
//객체가 가지는 메소드는 공통으로 사용 -> prototype
Member.prototype.makeHtml = function(){
    return '[id:'+this.userId+' ,pw: '+this.pw+',name:'+this.userName+' ]'
};

///////////////////////////////////////////////

//사용자가 입력한 정보를 가지고 Member객체를 생성
//submit 이벤트 연결

window.onload = function(){
    //regForm 캐스팅
    var regForm = document.getElementById('regForm');
    regForm.onsubmit = function() {

        //사용자가 입력한 값
        var userid = document.querySelector('#userID').value;
        var pw = document.querySelector('#pw').value;
        var repw = document.querySelector('#repw').value;
        var name = document.querySelector('#userName').value;

        if(userid.trim().length < 1){
            alert('이름을 입력해주세요.');
            return false;
        }
        if(pw.trim().length < 1 || repw.trim().length < 1) {
            alert('비밀번호를 입력해주세요.');
            return false;
        }

        // 비밀번호 비밀번호 확인 일치 여부 체크 
        if(pw.trim() != repw.trim()) {
            alert('비밀번호와 비밀번호확인과 일치하지 않습니다.\n 다시확인해주세요.');
            return false;
        }

        console.log(userid);
        console.log(pw);
        console.log(repw);
        console.log(name);

        var member = new Member(userid,pw,name);

        console.log(typeof member, member.makeHtml());








        return false;
    }




}

