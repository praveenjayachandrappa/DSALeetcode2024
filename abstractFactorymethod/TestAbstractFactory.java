package abstractFactorymethod;

import abstractFactorymethod.consumerclass.ComputerFactory;
import abstractFactorymethod.factoryclasses.PCFactory;

public class TestAbstractFactory {

    public static void main(String[] args) {


        PCFactory pcFactory=new PCFactory("2 GB","500 GB","2.4 GHz");
        //Computer computer = pcFactory.createComputer();
        Computer computer = ComputerFactory.getComputer(pcFactory);

        System.out.println("Abstract PC config : "+computer);

    }
}
