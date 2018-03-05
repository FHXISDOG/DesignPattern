package CreationalPatterns.FactoryPattern.AbstractFactoryPattern;

import jdk.nashorn.internal.objects.annotations.Getter;

public class M4A1 implements Gun{
    @Override
    public void fire() {
        System.out.println("M4A1 fire!!!");
    }
}
