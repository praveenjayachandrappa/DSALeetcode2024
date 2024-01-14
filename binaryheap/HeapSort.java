package binaryheap;

import java.util.Arrays;

public class HeapSort {
    /**
     *
     //create a heap of n elements

     //delete n elements one by one
     */

    public  void createHeap(int[] A,int idx){


        int t=A[idx];

        int i=idx;

        while (i>1 && t > A[i/2]){

            A[i]=A[i/2];
            i=i/2;
        }

        A[i]=t;
    }

    public void deleteHeap(int[] A,int idx){

        int x=A[1];

        A[1]=A[idx];

        int i=1,j=2*i;

        while (j<idx-1){

            if(A[j+1] > A[j]){
                j=j+1;
            }

            if(A[j] > A[i]){
                int temp=A[i];

                A[i]=A[j];
                A[j]=temp;
                i=j;
                j=2*j;
            }
            else{
                break;
            }
        }

        A[idx]=x;

    }


    public static void main(String[] args) {


        int[] A={0,10,20,30,25,5,40,35};

        HeapSort obj=new HeapSort();

        for (int i = 2; i <A.length ; i++) {
            obj.createHeap(A,i);
        }

        System.out.println(Arrays.toString(A));

        for (int i = 1; i <A.length ; i++) {

            obj.deleteHeap(A,A.length-i);
        }

        System.out.println("After sorting using heap sort....");
        System.out.println(Arrays.toString(A));
    }
    //Time complexity of the heap sort is (nlogn)
}
