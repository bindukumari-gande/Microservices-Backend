package com.example.IDApp.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.IDApp.enity.Department1;
import com.example.IDApp.enity.Institute1;
@Repository
public interface InstituteRepository extends JpaRepository<Institute1,Integer>{

}
