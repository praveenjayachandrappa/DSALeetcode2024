public class FactorialSeries {


    public static void printFactSerisOfSetTwo(int n){

        for(int i=0;i<=n;i++){

            int factOfi=fact(i);
            System.out.print(i+",");
            System.out.print(factOfi+",");
        }

    }

    private static int fact(int x) {

        if(x == 0) return 1;

        return fact(x-1) * x;
    }


    public static void main(String[] args) {

        printFactSerisOfSetTwo(100);

    }
}
