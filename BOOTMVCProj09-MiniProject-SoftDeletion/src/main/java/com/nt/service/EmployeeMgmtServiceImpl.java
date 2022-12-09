package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Department;
import com.nt.entity.Employee;
import com.nt.repo.DepartmentRepository;
import com.nt.repo.IEmployeeRepository;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService 
{
	@Autowired
private IEmployeeRepository empRepo;
	@Autowired
	private DepartmentRepository deptRepo;
	
	@Override
	public Iterable<Employee> getAllEmployees() 
	{
		
		return empRepo.findAll();
	}

	@Override
	public String registerEmployee(Employee emp) {
		
		return "emp is saves with id value"+empRepo.save(emp).getEmpno();
	}

	@Override
	public Employee getEmployeeByNo(int eno) 
	{
	Employee emp=empRepo.findById(eno).orElseThrow(()->new IllegalArgumentException());
		return emp;
	}

	@Override
	public String updateEmoployee(Employee emp) {
		
		return "employee is updated with havinf id value"+empRepo.save(emp).getEmpno();
		}

	@Override
	public String removeEmployee(int eno) {
		
		empRepo.deleteById(eno);
		return eno+"employee id employee is deleted";
	}

	@Override
	public List<Integer> fetchAllDeptno() {
	List<Integer> deptList=deptRepo.getAllDeptNo();
		return deptList;
	}

	@Override
	public List<String> fetchAllDeptNames() {
		List<String>deptNamesList=deptRepo.getAllDeptNames();
		return deptNamesList;
	}
	

}
