package CreationalPatterns.FactoryPattern.FactoryMethodPattern;

public class FileLogger implements Logger{
    @Override
    public void writeLog() {
        System.out.println("log write to file");
    }
}
