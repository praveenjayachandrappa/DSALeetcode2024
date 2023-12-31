package FactoryDesignpattern;

public class ConcreateCreatorA extends Creator{


    @Override
    public Product createProduct() {
        return new ConcreateProductA();
    }
}
