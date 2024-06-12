package com.example.IDApp.Service;

import java.util.List;

import com.example.IDApp.enity.Department1;

public interface DepartmentService {
	void deleteDepartmentsByInstituteId(int id);

	List<Department1> getDepartment(int id);
}
