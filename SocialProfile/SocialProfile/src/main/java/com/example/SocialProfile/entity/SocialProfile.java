package com.example.SocialProfile.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SocialProfile {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

		private int spId;
	    
		private String name;
		private String description;
		private int id;
		
		@Transient
		Institute1 institute;

	}


