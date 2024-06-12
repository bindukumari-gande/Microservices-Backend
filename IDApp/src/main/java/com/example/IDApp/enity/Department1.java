package com.example.IDApp.enity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Transient;
@Entity
public class Department1 {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int deptId;
	
	private String deptName;
	private String shortName;
	private String deptCode;
	private String description;
	
	@ManyToOne
	@JoinColumn(name="id")
	Institute1 institute;
	
	@Transient
	SocialProfile socialprofile;

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Institute1 getInstitute() {
		return institute;
	}

	public void setInstitute(Institute1 institute) {
		this.institute = institute;
	}

	public SocialProfile getSocialprofile() {
		return socialprofile;
	}

	public void setSocialprofile(SocialProfile socialprofile) {
		this.socialprofile = socialprofile;
	}

}
