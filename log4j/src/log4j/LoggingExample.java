package log4j;
import java.io.*;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LoggingExample {
	static Logger logger=Logger.getLogger(LoggingExample.class.getName());
	public static void main(String args[]) {
		try {
			LogManager.getLogManager().readConfiguration(new FileInputStream("src/mylogging.properties"));
		}
		catch(SecurityException | IOException e) {
			e.printStackTrace();
		}
		logger.setLevel(Level.FINE);
		logger.addHandler(new ConsoleHandler());
		//adding custom handler
		//logger.addHandler(new MyHandler());
		try {
			//FileHandler file name with max size and no.of log files limit
			Handler FileHandler=new FileHandler("C:\\Users\\Supraja Boga\\Desktop\\logging.log",200000,5);
			//FileHandler.setFormatter(new MyFormatter());
			//setting custom filter for FileHandler
			//FileHandler.setFilter(new MyFilter());
			logger.addHandler(FileHandler);
			for(int i=0;i<10;i++) {
				//logging messages
				if(i%7==0) {
					logger.log(Level.SEVERE,"Something wrong "+i);
					continue;
				}
				else if(i%5==0) {
					logger.log(Level.WARNING,"Just a warning message "+i);
					continue;
				}
				logger.log(Level.INFO,"Logging message "+i);
				logger.log(Level.CONFIG,"Config data "+i);
			}
		}
		catch(SecurityException | IOException e) {
			e.printStackTrace();
		}
	}
}
