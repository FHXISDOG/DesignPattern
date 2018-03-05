package CreationalPatterns.FactoryPattern.SimpleFactoryPattern;

public class Main {
    public static void main(String[] args) {

        //在工厂中获取奥迪车
        Car audi = CarFactory.getCar("Audi");
        audi.drive();
        audi.stop();

        //在工厂中获取奔驰车
        Car benz = CarFactory.getCar("Benz");
        benz.drive();
        benz.stop();

    }
}
