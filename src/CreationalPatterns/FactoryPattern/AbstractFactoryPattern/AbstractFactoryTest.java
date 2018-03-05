package CreationalPatterns.FactoryPattern.AbstractFactoryPattern;

import org.junit.Test;

public class AbstractFactoryTest {
    @Test
    public void testAbstractFactory() {
        AbstractFactory factory ;
        factory = new BenzFactory();
        Car Beaz = factory.getCar();
        Gun AK47 = factory.getGun();
        Beaz.drive();
        Beaz.stop();
        AK47.fire();
    }
}
