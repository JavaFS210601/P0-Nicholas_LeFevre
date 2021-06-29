package com.revature.models;

public class Member {
		
	private int member_id;
	private String f_name;
	private String l_name;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phone_number;
	private int membership_id;
	
	
	
	//boiler plate code
	
	//no args constructor
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}


	//args constructor
	public Member(int member_id, String f_name, String l_name, String address, String city, String state, String zip,
			String phone_number, int membership_id) {
		super();
		this.member_id = member_id;
		this.f_name = f_name;
		this.l_name = l_name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone_number = phone_number;
		this.membership_id = membership_id;
	}


	//args constructor without member_id so we can add new members to the gym!
	public Member(String f_name, String l_name, String address, String city, String state, String zip, String phone_number,
			int membership_id) {
		super();
		this.f_name = f_name;
		this.l_name = l_name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone_number = phone_number;
		this.membership_id = membership_id;
	}


	@Override
	public String toString() {
		return "Id: " + member_id + ", First Name: " + f_name + ", Last Name: " + l_name + ", Address: " + address
				+ ", " + city + ", " + state + ", " + zip + " Phone Number: " + phone_number
				+ ", Tier: " + membership_id ;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((f_name == null) ? 0 : f_name.hashCode());
		result = prime * result + ((l_name == null) ? 0 : l_name.hashCode());
		result = prime * result + member_id;
		result = prime * result + membership_id;
		result = prime * result + ((phone_number == null) ? 0 : phone_number.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((zip == null) ? 0 : zip.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (f_name == null) {
			if (other.f_name != null)
				return false;
		} else if (!f_name.equals(other.f_name))
			return false;
		if (l_name == null) {
			if (other.l_name != null)
				return false;
		} else if (!l_name.equals(other.l_name))
			return false;
		if (member_id != other.member_id)
			return false;
		if (membership_id != other.membership_id)
			return false;
		if (phone_number == null) {
			if (other.phone_number != null)
				return false;
		} else if (!phone_number.equals(other.phone_number))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (zip == null) {
			if (other.zip != null)
				return false;
		} else if (!zip.equals(other.zip))
			return false;
		return true;
	}


	public int getMember_id() {
		return member_id;
	}


//	public void setMember_id(int member_id) {
//		this.member_id = member_id;
//	}


	public String getF_name() {
		return f_name;
	}


	public void setF_name(String f_name) {
		this.f_name = f_name;
	}


	public String getL_name() {
		return l_name;
	}


	public void setL_name(String l_name) {
		this.l_name = l_name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getZip() {
		return zip;
	}


	public void setZip(String zip) {
		this.zip = zip;
	}


	public String getPhone_number() {
		return phone_number;
	}


	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}


	public int getMembership_id() {
		return membership_id;
	}


	public void setMembership_id(int membership_id) {
		this.membership_id = membership_id;
	}
	
	
	
	
	
	
	
	
	
}
