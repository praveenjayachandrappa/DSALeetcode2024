import java.util.Arrays;

public class SumOfArrayElements {



    public static int sum_recursive(int[] A,int index,int sum){

        if(index<A.length){
            sum+=A[index];
            index++;
            return sum_recursive(A,index,sum);
        }
        return sum;
    }

    public static int sum_recursive(int[] A,int n){

        if(n>=0){
            return sum_recursive(A,n-1)+A[n];
        }
        return 0;
    }

    private static int[] reverse(int[] A) {

//        for (int i=0,j=A.length-1;i<=j;i++,j--){
//
//            int temp=A[i];
//            A[i]=A[j];
//            A[j]=temp;
//        }
//
//       // return A;
//

        int[] B=new int[A.length];

        for (int i = A.length-1,j=0; i >=0 ; i--,j++) {
            B[j]=A[i];
        }

        for (int i = 0; i < A.length; i++) {

            A[i]=B[i];
        }

        return A;
    }

    public static void main(String[] args) {


        int[] A={5,6,8,3,2,10,4};
//
//        int sum = sum_recursive(A, 0, 0);
//
//        System.out.println(sum);
//
//        System.out.println(sum_recursive(A,A.length-1));



        System.out.println(Arrays.toString(reverse(A)));
    }
}
