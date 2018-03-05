package CreationalPatterns.FactoryPattern.SimpleFactoryPattern;

public class CarFactory {
    public static Car getCar(String type) {
        if (type.equalsIgnoreCase("Audi")) {
            return new Audi();
        } else if (type.equalsIgnoreCase("Benz")) {
            return new Benz();
        }else {
            return null;
        }
    }
}
