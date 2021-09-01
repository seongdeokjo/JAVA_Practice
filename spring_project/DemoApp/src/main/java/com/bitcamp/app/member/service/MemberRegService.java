package com.bitcamp.app.member.service;

/*@Service
public class MemberRegService {

//	@Autowired
//	private MemberDao dao;

	@Autowired
	JdbcTemplateMemberDao dao;
	
	
	final String UPLOAD_URI ="/uploadFile1";

	public int regMember(MemberRegRequest regRequest, HttpServletRequest request) {
		int result = 0;
		Member member = new Member();
		try {
			
			member.setMemberId(regRequest.getMemberId());
			member.setMemberPw(regRequest.getMemberPw());
			member.setMemberName(regRequest.getMemberName());

			if (regRequest.getMemberPhoto() != null ) {
				member.setMemberPhoto(regRequest.getMemberPhoto().getOriginalFilename());
				 saveFile(request, regRequest.getMemberPhoto());
			}
			System.out.println(member.getMemberPhoto());
			result = dao.insertMember(member);

		} catch (IllegalStateException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		return result;
	}

	// 사용자 업로드한 파일을 저장하는 메소드
	private void saveFile(HttpServletRequest request, MultipartFile file) throws IllegalStateException, IOException {

		// 저장 경로 : 시스템 경로
		String saveDir = request.getSession().getServletContext().getRealPath(UPLOAD_URI);
		
		// 새롭게 저장할 파일
		File newFile = new File(saveDir, file.getOriginalFilename());
		// 파일 저장
		file.transferTo(newFile);	
	}
}
*/