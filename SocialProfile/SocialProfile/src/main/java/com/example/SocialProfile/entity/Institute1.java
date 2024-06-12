package com.example.SocialProfile.entity;

import jakarta.persistence.Transient;

public class Institute1 {
	private int id;
	
	private String instuteName;
	
	private String shortName;
	private String emailId;
	private String instituteCode;
	private long contactNumber;
	@Transient
	private SocialProfile socialprofile;
}
