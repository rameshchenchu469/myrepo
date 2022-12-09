package com.nt.beans;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@Component("report")
public class ReportGenerator
{
	/*@Scheduled(initialDelay=4000,fixedDelay=3000)
public void generateSalesReport()
{
	System.out.println("Sales Report"+" "+new Date()); 
	try {
		Thread.sleep(4000);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
	

	/*@Scheduled(initialDelay=4000,fixedRate=5000)
public void generateSalesReport()
{
	System.out.println("Sales Report"+" "+new Date()); 
	try {
		Thread.sleep(4000);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}*/
	@Scheduled(cron="10 4/5 21 * * *")
	public void generateSalesReport()
	{
		System.out.println("Sales Report"+" "+new Date()); 
	}
}


