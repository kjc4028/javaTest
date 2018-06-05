package com.web.qtz;

import java.text.SimpleDateFormat;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class OutputJobBean extends QuartzJobBean {

	@Override
	protected void executeInternal(JobExecutionContext arg0) throws JobExecutionException {
		// TODO Auto-generated method stub
		long time = System.currentTimeMillis();
		SimpleDateFormat date = new SimpleDateFormat("YYYY-MM-dd HH:mm:SS");
		System.out.println("test_batch: "+ date.format(time));
	}
	
}
