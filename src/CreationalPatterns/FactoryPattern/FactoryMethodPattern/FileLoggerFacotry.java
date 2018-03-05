package CreationalPatterns.FactoryPattern.FactoryMethodPattern;

public class FileLoggerFacotry implements LoggerFactory{
    @Override
    public Logger createLogger() {
        Logger fileLogger = new FileLogger();
        return fileLogger;
    }
}
