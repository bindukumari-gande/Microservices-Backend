package com.example.IDApp.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.IDApp.enity.Department1;
import com.example.IDApp.enity.Institute1;
@Repository
public interface DepartmentRepository extends JpaRepository<Department1,Integer> {
	void deleteByInstituteId(int id);
	@Query(value = "SELECT * FROM Department1 WHERE id = :d", nativeQuery = true)
	List<Department1> getDepartment(@Param("d") int id);

}
