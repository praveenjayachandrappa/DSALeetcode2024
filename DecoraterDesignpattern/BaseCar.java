package DecoraterDesignpattern;

public class BaseCar implements Car{
    @Override
    public void assemble() {
        System.out.println("This is a basic car");
    }
}
