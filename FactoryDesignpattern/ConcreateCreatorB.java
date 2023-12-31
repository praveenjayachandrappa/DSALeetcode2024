package FactoryDesignpattern;

public class ConcreateCreatorB extends Creator{


    @Override
    public Product createProduct() {
       return new ConcreateProductB();
    }
}
