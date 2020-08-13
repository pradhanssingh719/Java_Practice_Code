/***
 * actually inside class everything is same all we need to change inside our .xml file 
 * I added rolling file there to see logs in side a file
 */

package demo2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FileLogging {

	private static final Logger log = LogManager.getLogger(FileLogging.class.getName());     //this has to be static final... we are using this same log for each class

	public static void main(String[] args) {
		log.trace("Trace Message logged");
		log.debug("Debug Message Logged");
		log.info("Info Message logged");
		log.error("Error Message Logged");
		log.fatal("Fatal message Logged");
	}

}

