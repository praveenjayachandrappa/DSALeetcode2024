package abstractFactorymethod.consumerclass;

import abstractFactorymethod.Computer;
import abstractFactorymethod.factoryclasses.ComputerAbstractFactory;

public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory factory){

        return factory.createComputer();
    }
}
