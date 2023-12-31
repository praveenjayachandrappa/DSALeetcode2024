public class SingleMisingElement {


    public static void findSingleMissingElement(int[] A){

        int diff=A[0];

        for (int i = 0; i <A.length ; i++) {

            if(A[i]-i!=diff){
//                System.out.println(i+diff);
//                diff=A[i]-i;
                while (diff < A[i]-i){
                    System.out.println(diff+i);
                    diff++;
                }
            }
        }

    }


    public static void findingMissingElementsInUnsortedArray(int[] A,int low,int high){


        int n=A.length;

        int[] H=new int[high+1];

        for (int i = 0; i <n ; i++) {

            H[A[i]]++;
        }

        for (int i = low; i < high; i++) {

            if(H[i] == 0){
                System.out.println(i);
            }
        }
    }



    public static void main(String[] args) {


        //Single missing element in first N natural number
//
//        int[] A={1,2,3,4,5,6,8,9,10,12,13,16};
//
//        findSingleMissingElement(A);
//
//        int[] A={6,7,8,9,11,12,15,16,17,18,19};
//
//        findSingleMissingElement(A);


        //finding missing elements in unsorted Array

        int[] A={3,7,4,9,12,6,1,11,2};

        int low=1;

        int high=12;

        findingMissingElementsInUnsortedArray(A,low,high);
    }
}
