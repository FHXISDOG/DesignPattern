package CreationalPatterns.FactoryPattern.AbstractFactoryPattern;

public class BenzFactory extends AbstractFactory {
    @Override
    public Car getCar() {
        return new Benz();
    }

    @Override
    public Gun getGun() {
        return new AK47();
    }
}
