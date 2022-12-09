package com.nt.service;

import java.util.List;

import com.nt.entity.Department;
import com.nt.entity.Employee;

public interface IEmployeeMgmtService 
{
public Iterable<Employee> getAllEmployees();
public String registerEmployee(Employee emp);
public Employee getEmployeeByNo(int empno);
public String updateEmoployee(Employee emp);
public String removeEmployee(int eno);
public List<Integer> fetchAllDeptno();
public List<String>fetchAllDeptNames();
}
