package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.entity.Employee;
import com.nt.service.IEmployeeMgmtService;

@Controller
public class EmployeeOperatiopnsController 
{
	@Autowired
private IEmployeeMgmtService empService;

	@GetMapping("/")
	public String showHome()
	{
		return "home";
	}
	
	@GetMapping("/emp_report")
	public String showEmployeeReport(Map<String,Object>map)
	{
		System.out.println("EmployeeOperatiopnsController.showEmployeeReport()");
		Iterable<Employee> itEmps=empService.getAllEmployees();
		map.put("empsList",itEmps );
		
		return"show_employee_report";
	}
	
	@GetMapping("/emp_add")
	public String showFormForSaveEmployee(@ModelAttribute("emp")Employee emp)
	{
		return "register_employee";
	}
	
	@PostMapping("/emp_add")
	public String saveEmployee(@ModelAttribute("emp")Employee emp,Map<String,Object>map)
	{
		Iterable<Employee> itEmps=empService.getAllEmployees();
		String msg=empService.registerEmployee(emp);
		map.put("resultMsg", msg);
		map.put("empsList", itEmps);
		return "redirect:emp_report";
	}
	
	@GetMapping("/emp_edit")
	public String showEditEmpFormPage(@RequestParam("no")int no,@ModelAttribute("emp")Employee emp)
	{
		Employee emp1=empService.getEmployeeByNo(no);
		BeanUtils.copyProperties(emp1, emp);
		return "update_employee";
	}
	
	@PostMapping("/emp_edit")
	public String editEmployee(RedirectAttributes attrs,@ModelAttribute("emp")Employee emp)
	{
		String msg=empService.updateEmoployee(emp);
		attrs.addFlashAttribute("resultMsg",msg);
	return "redirect:emp_report";	
}
	@GetMapping("/emp_delete")
	public String deleteEmployee(RedirectAttributes attrs,@ModelAttribute("no") int no)
	{
		String msg=empService.removeEmployee(no);
		attrs.addFlashAttribute("resultMsg",msg);
		return "redirect:emp_report";
	}
	
	@ModelAttribute("deptNoInfo")
	public List<Integer> refDataForDeptNoSelectBox()
	{
		return empService.fetchAllDeptno();
	}
	
	@ModelAttribute("deptNamesInfo")
	public List<String>refDataForDeptNameSelectBox()
	{
		return empService.fetchAllDeptNames();
	}
}


