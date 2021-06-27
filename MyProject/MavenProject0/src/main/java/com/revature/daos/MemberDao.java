package com.revature.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.Member;
import com.revature.util.ConnectionUtil;

public class MemberDao implements MemberDaoInterface{

	@Override
	public List<Member> getMembers() {
		
		try(Connection conn = ConnectionUtil.getConnection()){
			ResultSet rs = null;
			
			String sql = "SELECT * FROM members;";
			
			Statement s = conn.createStatement();
			
			rs = s.executeQuery(sql);
			
			List<Member> memberList = new ArrayList<>();
			
			while(rs.next()) {
				
				Member member = new Member(		
						rs.getInt("member_id"),
						rs.getString("f_name"),
						rs.getString("l_name"),
						rs.getString("address"),
						rs.getString("city"),
						rs.getString("state"),
						rs.getString("zip"),
						rs.getString("phone_number"),
						rs.getInt("membership_id")
						);
			
				memberList.add(member);
			}
			
			return memberList;
		}catch(SQLException e) {
			System.out.println("Big oopsie trying to access the Database");
			e.printStackTrace();
		}
		
		return null;
	}

	
	@Override
	public void addMember(Member mem) {
		try(Connection conn = ConnectionUtil.getConnection()){
			
			String sql = "INSERT INTO members(f_name, l_name, address, city, state, zip, phone_number, membership_id)"
					+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?);";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, mem.getF_name());
			ps.setString(2, mem.getL_name());
			ps.setString(3, mem.getAddress());
			ps.setString(4, mem.getCity());
			ps.setString(5, mem.getState());
			ps.setString(6, mem.getZip());
			ps.setString(7, mem.getPhone_number());
			ps.setInt(8, mem.getMembership_id());
			
			ps.executeUpdate();
			
			System.out.println("Member " + mem.getF_name() + " " + mem.getL_name() + " joined the gym!");
			
		}catch(SQLException e) {
			System.out.println("Member credentials failed :(");
			e.printStackTrace();
		}
		
	}


	@Override
	public void cancelMember(int mem) {
		try(Connection conn = ConnectionUtil.getConnection()){
			
			String sql = "DELETE FROM members WHERE member_id = ?;";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1, mem);
			
			ps.executeUpdate();
			
			System.out.println("Good luck getting the gains somewhere else...");
			
			
		}catch(SQLException e) {
			System.out.println("Failed to canel membership");
			e.printStackTrace();
		}
		
	}



}
