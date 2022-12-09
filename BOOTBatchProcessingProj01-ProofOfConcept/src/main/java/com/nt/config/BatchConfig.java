package com.nt.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.JobFactory;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nt.listner.JobMonitoringListner;
import com.nt.processor.BookDetailsProcessor;
import com.nt.reader.BookDetailsReader;
import com.nt.writer.BookDetailsWriter;


@Configuration
@EnableBatchProcessing
public class BatchConfig
{
	@Autowired
	private JobBuilderFactory jbFactory;
	@Autowired
	private StepBuilderFactory stepFactory;
	@Autowired
	private BookDetailsReader bdReader;
	@Autowired
	private BookDetailsProcessor bdProcessor;
	@Autowired
	private BookDetailsWriter bdWriter;
	@Autowired
	private JobMonitoringListner jobListner;
	
	@Bean(name="step1")
public Step createStep1()
{
		return stepFactory.get("step1")
				.<String,String>chunk(1)
				.reader(bdReader)
				.processor(bdProcessor)
				.writer(bdWriter)
				.build();
}
	
	@Bean(name="job1")
	public Job createJob()
	{
		return jbFactory.get("job1")
				.incrementer(new RunIdIncrementer())
				.listener(jobListner)
				.start(createStep1())
				.build();
	}
	
	
}
