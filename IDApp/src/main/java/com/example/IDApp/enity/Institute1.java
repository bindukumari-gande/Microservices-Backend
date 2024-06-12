package com.example.IDApp.enity;

import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Transient;
@Entity
public class Institute1 {
	
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int id;
		
		private String instuteName;
		
		private String shortName;
		private String emailId;
		private String instituteCode;
		private long contactNumber;
		@OneToMany
		List<Department1> department;
		
		@Transient
		List<SocialProfile> socialprofile;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getInstuteName() {
			return instuteName;
		}
		public void setInstuteName(String instuteName) {
			this.instuteName = instuteName;
		}
		public String getShortName() {
			return shortName;
		}
		public void setShortName(String shortName) {
			this.shortName = shortName;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		public String getInstituteCode() {
			return instituteCode;
		}
		public void setInstituteCode(String instituteCode) {
			this.instituteCode = instituteCode;
		}
		public long getContactNumber() {
			return contactNumber;
		}
		public void setContactNumber(long contactNumber) {
			this.contactNumber = contactNumber;
		}
		public List<Department1> getDepartment() {
			return department;
		}
		public void setDepartment(List<Department1> department) {
			this.department = department;
		}
		
		
		
		
		
}
