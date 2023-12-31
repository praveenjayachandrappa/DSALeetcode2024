package DecoraterDesignpattern;

public class TestClient {

    public static void main(String[] args) {

//        Car sportsCar=new SportsCarDecorater(new BaseCar());
//        sportsCar.assemble();

//        Car sportsLuxaryCar=new SportsCarDecorater(new LuxaryCarDecorator(new BaseCar()));
//            sportsLuxaryCar.assemble();

            Car luxaryCar=new LuxaryCarDecorator(new BaseCar());
            luxaryCar.assemble();
    }
}
