package FactoryDesignpattern;

public class ClientDemo {

    public static void main(String[] args) {

        Creator creator=new ConcreateCreatorB();
        Product product = creator.createProduct();

        System.out.println(product.getProductName());
    }
}
