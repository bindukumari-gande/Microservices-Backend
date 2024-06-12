package com.example.SocialProfile.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SocialProfile.Repository.SocialProfileRepository;
import com.example.SocialProfile.Service.SocialProfileService;
import com.example.SocialProfile.entity.SocialProfile;
@Service
public class SocialProfileImpl implements SocialProfileService{

	@Autowired
	private SocialProfileRepository spRepo;
	
	
	


	@Override
	public List<SocialProfile> getProfile(int id) {
		List<SocialProfile> sp=spRepo.getProfile(id);
		return sp;
	}


	
	
	

}
