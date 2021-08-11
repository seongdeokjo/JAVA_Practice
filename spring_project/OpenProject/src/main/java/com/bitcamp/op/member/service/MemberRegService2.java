package com.bitcamp.op.member.service;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.op.member.dao.JdbcTemplateMemberDao;
import com.bitcamp.op.member.dao.MemberDao;
import com.bitcamp.op.member.domain.Member;
import com.bitcamp.op.member.domain.MemberRegRequest;

@Service
public class MemberRegService2 {

//	@Autowired
//	private MemberDao dao;

	@Autowired
	JdbcTemplateMemberDao dao;
	
	final String UPLOAD_URI = "/uploadFile2";

	public int regMember(MemberRegRequest regRequest, HttpServletRequest request) {
		int result = 0;
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
			Member member = regRequest.toMember();

			// 파일 저장
			if (regRequest.getMemberphoto() != null && !regRequest.getMemberphoto().isEmpty()) {

				regRequest.getMemberphoto().transferTo(newFile);
				member.setMemberPhoto(newFileName);

				// 2. dao 저장
			}
			
			

			System.out.println(member.getMemberPhoto());
			result = dao.insertMember(member);

		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// db 예외 발생시 -> 저장된 파일을 삭제
			if (newFile != null && newFile.exists()) {
				newFile.delete();
				}
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}