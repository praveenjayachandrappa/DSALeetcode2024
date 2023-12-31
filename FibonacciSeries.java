import java.util.Arrays;

public class FibonacciSeries {

    //this function returns the nth Fibonacci series
//    public static int fib(int n){
//
//        if(n <= 1) return n;
//        return fib(n-1)+fib(n-2);
//
//    TC -O(2^n)
//    }

    public static int fib(int n, int[] f) {

        if (n <= 1) {
            f[n] = n;
            return n;
        } else {
            if (f[n - 2] == -1) {

                f[n - 2] = fib(n - 2, f);
            }
            if (f[n - 1] == -1) {

                f[n - 1] = fib(n - 1, f);
            }

            return f[n - 2] + f[n - 1];
        }
    }


    private static int fib_Iterative(int n){


        if(n<=1) return n;

        int t1=0;

        int t2=1;

        int sum=0;

        for (int i = 2; i <= n; i++) {

            sum = t1 + t2;

            t1 = t2;
            t2 = sum;
        }

        return sum;
    }

    public static void main(String[] args) {


        //Fibnoacci series
        //0,1,1,2,3,5,8,13,21,34,
        //0,1,2,3,4,5,6, 7, 8,  9

        int n = 9;

        int[] f = new int[n];

        Arrays.fill(f, -1);

        int nthFib = fib(n, f);

        System.out.println(nthFib);


        System.out.println(fib_Iterative(n));
    }
}
