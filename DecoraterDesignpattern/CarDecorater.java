package DecoraterDesignpattern;

public class CarDecorater implements Car{

    protected Car car;

    CarDecorater(Car carTobeDcorated){

        this.car=carTobeDcorated;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }
}
