package com.bitcamp.op.member.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.op.member.dao.Dao;
import com.bitcamp.op.member.domain.Member;

@Service
public class MemberRestService {
	
	private Dao dao;
	
	@Autowired
	private SqlSessionTemplate template;
	
	// memberCode로 검색한 Member 정보
	public Member getMember(int memberCode) {
		
		dao = template.getMapper(Dao.class);
		
		return dao.selectByIdx(memberCode);		 
	}
	
	// List 이용 모든 Member 정보
	public List<Member> getMembers() {
		dao = template.getMapper(Dao.class);
		
		return dao.selectAll();
	}
	
	// Map 이용 모든 Memeber 정보
	public Map<Integer, Member> getMembers1() {
		
		List<Member> list = getMembers();
		Map<Integer, Member> members = new HashMap<Integer,Member>();
		for(int i = 0; i < list.size(); i++) {
			members.put(list.get(i).getMemberCode(),list.get(i) );
		}
		
		return members;
	}
	
	
}
