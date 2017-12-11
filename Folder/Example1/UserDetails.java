package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity (name = "USER_DETAILS")
public class UserDetails {
	@Id
	@Column(name="USER_ID")
    private int UserID;
	@Column (name="USER_NAME")
	private String  UserName;
    public int getUserID() {
		return UserID;
	}
	public void setUserID(int userID) {
		UserID = userID;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	
    
    
}
