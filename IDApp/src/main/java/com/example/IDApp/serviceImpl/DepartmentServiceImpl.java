package com.example.IDApp.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.IDApp.Repository.DepartmentRepository;
import com.example.IDApp.Service.DepartmentService;
import com.example.IDApp.enity.Department1;

import jakarta.transaction.Transactional;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	@Autowired
	private DepartmentRepository deptRepo;

	@Override
	@Transactional
	public void deleteDepartmentsByInstituteId(int id) {
		// TODO Auto-generated method stub
		deptRepo.deleteByInstituteId(id);
		
	}

	@Override
	public List<Department1> getDepartment(int id) {
		List<Department1> d=deptRepo.getDepartment(id);
		return d;
	}

}
