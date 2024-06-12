package com.example.SocialProfile.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.SocialProfile.entity.SocialProfile;

public interface SocialProfileRepository extends JpaRepository<SocialProfile,Integer> {
	@Query(value="select * from social_profile where id=:i",nativeQuery=true)
	List<SocialProfile> getProfile(  @Param("i")int id);
	
	
	 
	
 
}
