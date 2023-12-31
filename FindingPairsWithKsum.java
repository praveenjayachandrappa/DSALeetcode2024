import java.util.HashMap;

public class FindingPairsWithKsum {


    public static void findParisWithKsum(int[] A,int k){


        HashMap<Integer,Integer> countMap=new HashMap<>();

        for (int i = 0; i < A.length ; i++) {

            int diff=k-A[i];

            if(countMap.containsKey(diff)){

                System.out.println("Pair exists between: "+diff+"->"+A[i]);
            }
            countMap.put(A[i],1);
        }


    }

    public static void main(String[] args) {


        int[] A={6,3,8,10,16,7,5,2,14};

        findParisWithKsum(A,10);
    }
}
