
package member;
//private Connection conn;
//private PreparedStatement pstmt;
//private ResultSet rs;



  //	login 기능 구현 예제 참고 코드
public class Login {
		
}

class LoginProgram {
    private String id;
    private String password;
    static boolean loginFlag = false;
    HashMap<String,String> memberTable = new HashMap<String,String>();
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
    //메뉴 출력 메소드
    public char display() {
        System.out.println("1.로그인   2.가  입   3. 로그아웃  4.종료");
        System.out.print(">>>");
        return input().charAt(0);
    }
    
    
    //입력 메소드
    public String input() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    
    //회원가입 메소드
    public void Join() {
        if (loginFlag) {
            System.out.println("자동로그아웃하고 새로운 회원가입을 시작합니다.");
            loginFlag = false;
        }
        while(true) {
            System.out.print("가입 id : ");
            String newId = input();
            if(memberTable.containsKey(newId)) {
                System.out.println("이미 존재하는 아이디 입니다.");
                continue;
            }
            System.out.print("가입 pw : ");
            String newPwd = input();
            memberTable.put(newId, newPwd);
            break;
        }
        System.out.println("저장 완료");
    }
    //로그인 메소드
    public void loginVaild() {
        if (loginFlag) {
            System.out.println("이미 로그인되어 있는 상태입니다.");
            return;
        }
    }    
        
        
    public void isMemberCheck(String id, String pw) {    
        if (memberTable.containsKey(id)) {
            if (!memberTable.get(id).equals(pw)) {
                System.out.println("비밀번호가 맞지 않습니다. 인증 실패");
            } else {
                System.out.println("인증 성공");
                loginFlag = true;
            }
        } else {
            System.out.println("존재하지 않는 아이디 입니다.");
        }
    }
    
    //로그아웃 메소드
    public void logout() {
        if (!loginFlag) {
            System.out.println("먼저 사용자 로그인이 필요합니다.");
            return;
        }
        System.out.println("로그아웃 합니다.");
        loginFlag = false;
    }
}
public class LoginQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LoginProgram program = new LoginProgram();
        while (true) {
            char select = program.display();
            
            switch (select) {
            case '1':
                program.loginVaild();
                if (LoginProgram.loginFlag) {
                    break;
                }
                System.out.print("아이디 입력 :");
                String myId = input.nextLine();
                program.setId(myId);
                System.out.print("비밀번호 입력 : ");
                String myPw = input.nextLine();
                program.setPassword(myPw);
                program.isMemberCheck(program.getId(), program.getPassword());
                break;
            case '2':
                program.Join();
                break;
            case '3':
                program.logout();
                break;
            case '4':    
                System.exit(0);
            default:
                System.out.println("잘못된 값 입력");
                break;
            }
        }
 
    }
}