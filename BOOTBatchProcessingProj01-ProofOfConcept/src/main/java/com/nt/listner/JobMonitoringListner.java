package com.nt.listner;

import java.util.Date;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.stereotype.Component;

@Component("jmListner")
public class JobMonitoringListner implements JobExecutionListener 
{
private long startTime,endTime;

public JobMonitoringListner()
{
	System.out.println("JobMonitoringListner::0-param constructor");
}
public void beforeJob(JobExecution jobExecution) 
{
	System.out.println("job is about begining at"+new Date());
	startTime=System.currentTimeMillis();
	System.out.println("Job Status::"+jobExecution.getStatus());
}
public void afterJob(JobExecution jobExecution)
{
	System.out.println("Job Completed At::"+new Date());
	endTime=System.currentTimeMillis();
	System.out.println("Job Status::"+jobExecution.getStatus());
	System.out.println("Job Execution time::"+(endTime-startTime));
}
}
