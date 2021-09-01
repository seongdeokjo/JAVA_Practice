package com.bitcamp.app.member.service;

/*@Service
public class MemberRegService3 {

//	@Autowired
//	private MemberDao dao;

//	@Autowired
//	JdbcTemplateMemberDao dao;

//	@Autowired
//	private MybatisMemberDao dao;

	@Autowired
	private SqlSessionTemplate template;

	private Dao dao;

	final String UPLOAD_URI = "/uploadFile2";

	public int regMember(MemberRegRequest regRequest, HttpServletRequest request) {
		int result = 0;
		File newFile = null;
		try {
			//1. 파일 저장
			Member member = regRequest.toMember();
				
			// 파일 저장
			if (regRequest.getMemberPhoto() != null && !regRequest.getMemberPhoto().isEmpty()) {
				// 시스템 경로
				String path = request.getSession().getServletContext().getRealPath(UPLOAD_URI);

				// 새로운 저장 폴더 : file
				File newDir = new File(path);
				
				
				if (!newDir.exists()) {
					newDir.mkdir();
					System.out.println("저장 폴더를 생성했습니다.");
				}
				
			// 파일 저장시에 파일 이름이 같으면 덮어쓴다 -> 회원별 고유한 파일 이름을 만들자
			String newFileName = regRequest.getMemberId() + System.currentTimeMillis();
			// cool 1231289123123123123

			// 새로운 File 객체
			newFile = new File(newDir, newFileName);
			
			regRequest.getMemberPhoto().transferTo(newFile);
			member.setMemberPhoto(newFileName);

			}else {
				member.setMemberPhoto("photo.png");
			}
			
//			System.out.println(member.getMemberPhoto());
			dao = template.getMapper(Dao.class);
			
			result = dao.insertMember(member);
			
			System.out.println("새롭게 등록된 memberCode =>"+member.getMemberCode());

		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// DB 예외 발생 시 -> 저장된 파일을 삭제
//			if (newFile != null && newFile.exists()) {
//				newFile.delete();
//			}
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return result;
	}
}
*/