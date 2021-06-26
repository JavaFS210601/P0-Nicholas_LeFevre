package com.revature.daos;

import java.util.List;

import com.revature.models.Member;

public interface MemberDaoInterface {
	
	
	public List<Member> getMembers(); //return a list of all members in the gym 
	
	public void addMember(Member mem);
	

}
