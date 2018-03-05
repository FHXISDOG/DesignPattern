package CreationalPatterns.FactoryPattern.AbstractFactoryPattern;

public class Benz implements Car {
    @Override
    public void drive() {
        System.out.println("Benz is driving");
    }

    @Override
    public void stop() {
        System.out.println("Benz is stoping");
    }
}
