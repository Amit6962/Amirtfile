package com.vir.model;

import org.apache.log4j.Logger;

public class LogCalc {
	
	private static final Logger logger=Logger.getLogger(LogCalc.class);
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5,y=4;
				int z=x+y;
				logger.trace("the value of list item is 5");
				logger.debug("the method called with following arguments");
				logger.info("the library was installed or message from the server");
				logger.warn("the library to convert xml was not found using default");
				logger.error("the expection with values occur");
				logger.fatal("sorry please restart the system");
				
				logger.info("Add completed");
				logger.error("error occured");
				logger.debug("Debug message");
				logger.trace("this is trace");
				logger.warn("Warning meassge");
				
				System.out.println("z= "+z);
				

	}

}
