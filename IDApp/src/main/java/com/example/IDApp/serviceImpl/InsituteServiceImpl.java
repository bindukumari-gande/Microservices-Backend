package com.example.IDApp.serviceImpl;

import org.apache.logging.log4j.CloseableThreadContext.Instance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.IDApp.Repository.DepartmentRepository;
import com.example.IDApp.Repository.InstituteRepository;
import com.example.IDApp.Service.InstituteService;

import com.example.IDApp.enity.Department1;
import com.example.IDApp.enity.Institute1;


import jakarta.persistence.EntityNotFoundException;
@Service
public class InsituteServiceImpl implements InstituteService {
	
	@Autowired
	private DepartmentRepository deptRepo;
	
	@Autowired
	private InstituteRepository instituteRepo;
	
	
	
	@Override
	public Department1 addDepartment(Department1 department, int id) {
	    // Retrieve the institute from the database using the provided institute ID
	    Institute1 institute = instituteRepo.findById(id).orElseThrow(() -> new EntityNotFoundException("Institute not found with id: " + id));
	    
	    // Set the retrieved institute to the department
	    department.setInstitute(institute);
	    
	    // Save the department
	    return deptRepo.save(department);
	}
	
	

}
