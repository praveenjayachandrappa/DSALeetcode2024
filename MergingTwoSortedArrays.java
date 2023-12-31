import java.util.Arrays;

public class MergingTwoSortedArrays {

    //Big theta (M+N)

    public static void main(String[] args) {

        int[] A={3,8,10,16,20,25,32,67,78,99};

        int[] B={4,8,10,12,22,30,32};

        int[] intersection = intersection(A, B);

        System.out.println(Arrays.toString(intersection));  //8,10,32
    }

    public static int[] intersection(int[] A,int[] B){

        //Two sorted arrays

        int m=A.length;

        int n=B.length;

        int[] C=new int[m+n];

        int i=0,j=0,k=0;

        while (i<m && j<n){

            if(A[i]==B[j]){
                C[k++]=A[i];
                j++;
                i++;
            }
            else if(A[i] < B[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return C;
    }
    private static int[] merge(int[] A, int[] B) {

        int m=A.length;

        int n=B.length;

        int[] C=new int[m+n];

        int i=0,j=0,k=0;
        while (i<m && j<n){
            if(A[i] < B[j]){
                C[k++]=A[i++];
            }
            else{
                C[k++]=B[j++];
            }
        }

        //copy remaining elements to the C

        for (;i<m;i++){
            C[k++]=A[i];
        }

        for (;j<n;j++){
            C[k++]=B[j];
        }

        return C;
    }


    public static int[] union(int[] A,int[] B){

        //Two sorted arrays

        int m=A.length;

        int n=B.length;

        int[] C=new int[m+n];

        int i=0,j=0,k=0;

        while (i<m && j<n){

            if(A[i]==B[j]){
             C[k++]=A[i];
             j++;
             i++;
            }
            else if(A[i] < B[j]){
                C[k++]=A[i++];
            }
            else{
                C[k++]=B[j++];
            }
        }

        for (;i<m;i++){
            C[k++]=A[i++];
        }
        for (;j<n;j++){
            C[k++]=B[j++];
        }

        return C;
    }

    public static int[] difference(int[] A,int[] B){

        //Two sorted arrays

        int m=A.length;

        int n=B.length;

        int[] C=new int[m+n];

        int i=0,j=0,k=0;

        while (i<m && j<n){

            if(A[i]==B[j]){
                C[k++]=A[i];
                j++;
                i++;
            }
            else if(A[i] < B[j]){
                C[k++]=A[i++];
            }
            else{
                C[k++]=B[j++];
            }
        }

        for (;i<m;i++){
            C[k++]=A[i++];
        }
        for (;j<n;j++){
            C[k++]=B[j++];
        }

        return C;
    }

}
