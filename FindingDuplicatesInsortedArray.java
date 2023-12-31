public class FindingDuplicatesInsortedArray {


    public static void printDuplicateElements(int[] A){

        int max=A[A.length-1];

        int[] H=new int[max+1];

        for (int i = 0; i < A.length; i++) {

            H[A[i]]++;
        }


        for (int i = 0; i <=max ; i++) {

            if(H[i] > 1){

                System.out.println(i);
            }
        }

    }


    public static void main(String[] args) {


        int[] A={3,6,8,8,10,12,15,15,15,20,20,22};

        //int[] A={3,2,5,1,8,8,4,4,9,6};
        printDuplicateElements(A);

    }
}
