package br.com.raphael;

import org.quartz.CronTrigger;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.impl.StdSchedulerFactory;

public class CronTriggerExample {
	
    public static void main( String[] args ) throws Exception {
    	
    	JobDetail job = new JobDetail();
    	job.setName("dummyJobName");
    	job.setJobClass(HelloJob.class);
    	    	
    	CronTrigger trigger = new CronTrigger();
    	trigger.setName("dummyTriggerName");
    	//aqui eu seto 10s para executar o job
    	trigger.setCronExpression("0/10 * * * * ?");
    	
    	//Agendamento
    	Scheduler scheduler = new StdSchedulerFactory().getScheduler();
    	scheduler.start();
    	scheduler.scheduleJob(job, trigger);
    
    }
}
