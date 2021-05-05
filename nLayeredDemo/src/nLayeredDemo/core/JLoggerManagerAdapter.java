package nLayeredDemo.core;

import nLayeredDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService{

	@Override
	public void logToSystem(String message) {
		
		//Adaptation (Adapter Design Pattern)
		JLoggerManager manager = new JLoggerManager();
		manager.log(message);
		
	}

}
