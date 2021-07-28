package member.service;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import member.dao.MemberDao;
import member.domain.Member;
import member.domain.MemberRequest;
import member.util.ConnectionProvider;
import member.util.JdbcUtil;

public class MemberRegService {

	private MemberRegService() {
	}

	private static MemberRegService service = new MemberRegService();

	public static MemberRegService getInstance() {
		return service;
	}

	public int regMember(HttpServletRequest request) throws FileUploadException {
		int result = 0;
		Connection conn = null;
		MemberDao dao = null;

		Member member = new Member();
		try {
			// 1. multipart 여부 확인
			boolean isMultipart = ServletFileUpload.isMultipartContent(request);

			if (isMultipart) {

				// 2. 파일을 저장할 Factory 객체 생성
				DiskFileItemFactory factory = new DiskFileItemFactory();

				// 3. 요청 처리를 (form 안에 있는 input 들을 분리 ) 위해서 ServletFileUpload 생성
				ServletFileUpload upload = new ServletFileUpload(factory);

				// 4. 사용자 요청을 파싱(분리 : 원하는 형태로 분리 input => FileItem)
				// FileItem -> input 데이터를 저장하고 있는 객체
				List<FileItem> items = upload.parseRequest(request);

				Iterator<FileItem> itr = items.iterator();

				while (itr.hasNext()) {

					FileItem item = itr.next(); // text, checkbox, hidden, password, file

					// file과 file이외의 폼을 구분
					if (item.isFormField()) {
						// 회원 아이디, 회원 이름, 비밀번호
						String paramName = item.getFieldName();
						if (paramName.equals("memberId")) {
							// String value = item.getString("utf-8");
							member.setMemberId(item.getString("utf-8"));
						} else if (paramName.equals("memberPw")) {
							member.setMemberPw(item.getString("utf-8"));
						} else if (paramName.equals("memberName")) {
							member.setMemberName(item.getString("utf-8"));
						}
					} else {
						// 사진 데이터 처리
						String uploadUri = "upload";
						// 시스템 경로
						String dir = request.getSession().getServletContext().getRealPath(uploadUri);

						File saveDir = new File(dir);

						if (!saveDir.exists()) {
							saveDir.mkdir();
						}

						String paramName = item.getFieldName();
						if (paramName.equals("photo")) {

							// 파일 이름, 사이즈
							if (item.getName() != null && item.getSize() > 0) {
								// 저장
								item.write(new File(saveDir, item.getName()));
								// DB에 저장할 파일의 이름
								member.setMemberPhoto(item.getName());
							}
						}
					}
				}
			} else {
				throw new Exception("multipart 타입이 아닙니다.");
			}
			////////////////////
			// db insert
			// Connection, MemberDao
			

			conn = ConnectionProvider.getConnection();
			dao = MemberDao.getInstance();
			conn.setAutoCommit(false);

			result = dao.insertMember(conn, member);

			conn.commit();

			JdbcUtil.close(conn);

		} catch (SQLException e) {
			//db오류시 파일은 저장되면서 더미데이터가 될 수 있기때문에 오류 발생시 폴더의 파일삭제 처리 
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}