package com.example.IDApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.IDApp.ProfileServiceConnection.SocialProfileFeign;
import com.example.IDApp.Repository.InstituteRepository;
import com.example.IDApp.Service.DepartmentService;
import com.example.IDApp.Service.InstituteService;
import com.example.IDApp.enity.Department1;
import com.example.IDApp.enity.Institute1;
import com.example.IDApp.enity.SocialProfile;






@RestController
@RequestMapping("/InstDept")
@CrossOrigin("*")
public class InstituteController {
	@Autowired
	private InstituteService service;
	
	@Autowired
	private DepartmentService deptservice;
	
	@Autowired
	private InstituteRepository instituteRepo;
	
	@Autowired
	 private SocialProfileFeign spfeign;

	@PostMapping("/addinst")
	Institute1 newInstitute(@RequestBody Institute1 newInstitute) {
		return instituteRepo.save(newInstitute);
	}
	
	@GetMapping("/allinst")
	List<Institute1> getAllInstitute(){
		return instituteRepo.findAll();
	}
	
     


	
	@DeleteMapping("/inst/{id}")
	String deleteInstitute(@PathVariable int id) {
		 instituteRepo.deleteById(id);
		 return "User with Id "+id+"is deleted" ;
		
	}
	

	
	@DeleteMapping("/{id}/departments")
    public ResponseEntity<String> deleteDepartmentsByInstituteId(@PathVariable int id) {
        deptservice.deleteDepartmentsByInstituteId(id);
        return ResponseEntity.ok("Departments deleted successfully for institute ID: " +id);
    }
	
	
	
	
	@GetMapping("/{id}/get")
	public List<SocialProfile> getProfileById(@PathVariable("id")int id) {
		return spfeign.getProfileById(id);
	}
	
	
	
	@PostMapping("/{id}/dept")
	public ResponseEntity<Department1> addNewDepartment(@RequestBody Department1 department,@PathVariable("id")int id){
		return new ResponseEntity<Department1>(service.addDepartment(department, id),HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
		public List<Department1> getDepartmentById(@PathVariable("id")int id){
			return deptservice.getDepartment(id); 
		}
	}
	
	

