import java.util.Arrays;

public class MovePostiveNumberandNegativeNumber {



    public static int[] moveNumbers(int[] A){

        int n= A.length;


        int low=0,high=A.length-1;

        while (low<high){

            while (A[low]<0){
                low++;
            }

            while (A[high]>=0){
                high--;
            }

            if(low<high){

                int t=A[low];

                A[low]=A[high];

                A[high]=t;

            }
        }

        return A;
    }

    public static void main(String[] args) {


        int[] A={-10,-3,4,5,-4,-3,6,3,2,5,-5,9,23,42,-11,-13,56,90};

        int[] numbers = moveNumbers(A);

        System.out.println(Arrays.toString(numbers));
    }
}
