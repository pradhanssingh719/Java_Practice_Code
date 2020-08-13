package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingDemo {
	
	private static final Logger log = LogManager.getLogger(LoggingDemo.class.getName());     //this has to be static final... we are using this same log for each class

	public static void main(String[] args) {
		log.debug("Debug Message Logged");
		log.error("Error Message Logged");
	}

}
