package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity (name = "USER_DETAILS")
public class UserDetails {
	
    private int UserID;
	private String  UserName;
	@Id
	@Column(name="USER_ID")
    public int getUserID() {
		return UserID;
	}
    
	public void setUserID(int userID) {
		UserID = userID;
	}
	@Column (name="USER_NAME")
	public String getUserName() {
		return UserName +" from the getter";
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	
    
    
}
