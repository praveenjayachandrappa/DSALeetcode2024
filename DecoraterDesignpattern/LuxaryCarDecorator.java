package DecoraterDesignpattern;

public class LuxaryCarDecorator extends CarDecorater{

    public LuxaryCarDecorator(Car carDecorater){

        super(carDecorater);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding features of the Luxary car to the base component");
    }
}
