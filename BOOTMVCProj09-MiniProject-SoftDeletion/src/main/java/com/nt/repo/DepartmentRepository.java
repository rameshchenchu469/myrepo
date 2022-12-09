package com.nt.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.nt.entity.Department;

public interface DepartmentRepository extends CrudRepository<Department, Integer>
{
	@Query("select deptno from Department")
public List<Integer> getAllDeptNo();
	
	@Query("select deptname from Department")
	public List<String> getAllDeptNames();
}
