package binaryheap;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElement {


    public int findKthLargest(int[] nums, int k) {


        PriorityQueue<Integer> pq=new PriorityQueue<>();

//        for(int x:nums){
//            pq.add(x);
//        }
//
//        int count=1;
//        while (!pq.isEmpty()){
//            if(count==k) return pq.peek();
//            pq.poll();
//            count+=1;
//        }
//
//        return -1;

        for(int x:nums){
            pq.add(x);
            if(pq.size()>k)
                pq.poll();
        }

        return pq.peek();
    }
}
