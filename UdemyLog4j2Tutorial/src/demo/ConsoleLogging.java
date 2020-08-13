package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConsoleLogging {

	private static final Logger log = LogManager.getLogger(ConsoleLogging.class.getName());     //this has to be static final... we are using this same log for each class

	public static void main(String[] args) {                         //Preference order trace->debug->info->warn->error->fatal
		log.trace("Trace Message logged");
		log.debug("Debug Message Logged");
		log.info("Info Message logged");
		log.error("Error Message Logged");
		log.fatal("Fatal message Logged");
	}

}

