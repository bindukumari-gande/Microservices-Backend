package com.example.IDApp.enity;



import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

public class SocialProfile {
	
	private int spId;
	private String name;
	private String description;
	
	@OneToOne
	@JoinColumn(name = "id") 
	Institute1 institute;

	public int getSpId() {
		return spId;
	}

	public void setSpId(int spId) {
		this.spId = spId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

}
