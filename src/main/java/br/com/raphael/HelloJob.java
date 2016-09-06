package br.com.raphael;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class HelloJob implements Job {
	
	public void execute(JobExecutionContext context) throws JobExecutionException {
		System.out.println("Rapha testando Quartz! " + new Date().toString());	
	}
	
}
