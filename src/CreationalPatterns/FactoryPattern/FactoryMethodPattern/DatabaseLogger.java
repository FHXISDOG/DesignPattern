package CreationalPatterns.FactoryPattern.FactoryMethodPattern;


public class DatabaseLogger implements Logger{
    @Override
    public void writeLog() {
        System.out.println("log write to database");
    }
}
