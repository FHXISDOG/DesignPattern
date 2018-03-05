package CreationalPatterns.FactoryPattern.SimpleFactoryPattern;

public class Audi implements Car {
    @Override
    public void drive() {
        System.out.println("Audi is driving!");
    }

    @Override
    public void stop() {
        System.out.println("Audi is stoping");
    }
}
