package CreationalPatterns.FactoryPattern.AbstractFactoryPattern;

public class AudiFactory extends AbstractFactory{
    @Override
    public Car getCar() {
        return new Audi();
    }

    @Override
    public Gun getGun() {
        return new M4A1();
    }
}
