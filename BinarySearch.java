public class BinarySearch {


    public static int binarySearch_recursive(int[] A,int key){

        return binarySearch_recursive(0,A.length-1,A,key);
    }

    public static int binarySearch_recursive(int low,int high,int[] A,int key){


        if (low <= high) {
            int mid = low + (high - low) / 2;

            if (A[mid] == key) return mid;

            else if (key < A[mid]) {
                return binarySearch_recursive(low, mid - 1, A, key);
            } else {
                return binarySearch_recursive(mid + 1, high, A, key);
            }
        }
        return -1;
    }

    public static int binarySearch_iterative(int[] nums,int key){

        int low=0,high=nums.length-1;

        while (low<=high){
            int mid=low+(high-low)/2; //(low+high)/2;

            if(nums[mid] == key) return mid;

            else if(key < nums[mid]){

                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        //To apply Binary Search,An array must be sorted.
        //array of sorted integers
        int[] A={1,4,8,9,11,13,15,16,19,21,24,27,29,31};
        int key=21;

        System.out.println(binarySearch_iterative(A,key));

        System.out.println(binarySearch_iterative(A,22));


        System.out.println(binarySearch_recursive(A,key));

        System.out.println(binarySearch_recursive(A,22));
    }
}
