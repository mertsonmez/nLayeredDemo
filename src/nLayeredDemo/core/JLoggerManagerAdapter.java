package nLayeredDemo.core;

import  nLayeredDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService {
    //Adapter design pattern örneği

    @Override
    public void logToSystem(String message) {
        JLoggerManager manager = new JLoggerManager();
        manager.log("Loglandı");
    }


}
