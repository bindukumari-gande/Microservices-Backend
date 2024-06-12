package com.example.IDApp.ProfileServiceConnection;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.IDApp.enity.SocialProfile;



@FeignClient(name="SocialProfileService",url="http://localhost:9990/Profile")
public interface SocialProfileFeign {
	@GetMapping("/{id}/get")
	public List<SocialProfile> getProfileById(@PathVariable("id")int id);
	
	

}
