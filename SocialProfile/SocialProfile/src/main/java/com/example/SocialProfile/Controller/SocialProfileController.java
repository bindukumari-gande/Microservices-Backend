package com.example.SocialProfile.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SocialProfile.Repository.SocialProfileRepository;
import com.example.SocialProfile.Service.SocialProfileService;
import com.example.SocialProfile.entity.SocialProfile;




@RestController
@RequestMapping("/Profile")
@CrossOrigin("*")
public class SocialProfileController {
	
	@Autowired
	private SocialProfileRepository spRepo;
	
	@Autowired
	private SocialProfileService  spservice;
	
	
	@PostMapping("/newprofile")
	SocialProfile newSocialProfile(@RequestBody SocialProfile newSocialProfile) {
		return spRepo.save(newSocialProfile);
	}
	

	
	@GetMapping("/{id}/get")
	public List<SocialProfile> getProfileById(@PathVariable("id")int id){
		return spservice.getProfile(id);
	}

}
