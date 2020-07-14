package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.apache.logging.log4j.message.LoggerNameAwareMessage;

public class Log4j {
	
	 static Logger logger = LogManager.getLogger(Log4j.class);

	public static void main(String[] args) {
		
System.out.println("\n  Hello World...!  \n");
logger.info("This is an information Message");
logger.error("This is an error Message");
logger.warn("This is an warning Message");
logger.fatal("This is an fatal Message");

System.out.println("\n Completed Successfully");

		
	}

}
