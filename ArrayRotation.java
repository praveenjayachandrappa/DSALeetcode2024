import java.util.Arrays;

public class ArrayRotation {


    public static int[] leftRotate(int[] A,int k){

        k=k % A.length;

        while (k>0){

            int first=A[0];

            for(int i=1;i<A.length;i++){
                A[i-1]=A[i];
            }
            A[A.length-1]=first;
            k--;
        }

        return A;
    }
    public static void main(String[] args) {


        int[] A={2,4,5,7,8,9,10};

        int[] leftRoated = leftRotate(A, 4);//[5,7,8,9,10,2,4];

        System.out.println(Arrays.toString(leftRoated));
    }
}
