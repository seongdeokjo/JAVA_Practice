package com.bitcamp.op.member.service;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.op.jdbc.ConnectionProvider;
import com.bitcamp.op.jdbc.JdbcUtil;
import com.bitcamp.op.member.dao.MemberDao;
import com.bitcamp.op.member.domain.Member;
import com.bitcamp.op.member.domain.MemberRegRequest;

@Service
public class MemberRegService2 {

	@Autowired
	private MemberDao dao;

	final String UPLOAD_URI = "/uploadFile2";

	public int regMember(MemberRegRequest regRequest, HttpServletRequest request) {
		int result = 0;
		Connection conn = null;
		File newFile = null;
		try {

			// 1. 파일 저장

			// 시스템 경로
			String path = request.getSession().getServletContext().getRealPath(UPLOAD_URI);

			// 새로운 저장 폴더 : file
			File newDir = new File(path);

			if (!newDir.exists()) {
				newDir.mkdir();
				System.out.println("저장 폴더를 생성했습니다.");
			}
			// 파일 저장시에 파일 이름이 같으면 덮어쓴다 -> 회원별 고유한 파일 이름을 만들자
			String newFileName = regRequest.getMemberid() + System.currentTimeMillis();
			// cool 1231289123123123123

			// 새로운 File 객체
			newFile = new File(newDir, newFileName);

			// 파일 저장
			if (regRequest.getMemberphoto() != null && !regRequest.getMemberphoto().isEmpty()) {

				regRequest.getMemberphoto().transferTo(newFile);

				// 2. dao 저장
			}
			conn = ConnectionProvider.getConnection();
			Member member = regRequest.toMember();
			member.setMemberPhoto(newFileName);

			System.out.println(member.getMemberPhoto());
			result = dao.insertMember(conn, member);

		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// db 예외 발생시 -> 저장된 파일을 삭제
			if (newFile != null && newFile.exists()) {
				newFile.delete();
				}
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn);
		}
		return result;
	}
}