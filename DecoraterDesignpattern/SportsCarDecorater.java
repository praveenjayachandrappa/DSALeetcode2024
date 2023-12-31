package DecoraterDesignpattern;

public class SportsCarDecorater extends CarDecorater{

    SportsCarDecorater(Car carTobeDcorated) {
        super(carTobeDcorated);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding features of sports car to base compoent");
    }
}
