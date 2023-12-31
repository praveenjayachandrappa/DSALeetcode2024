public class InsertedPostionInSortedArray {

//
//    public static int getInsertPosition(int[] A,int key){
//
//        //Array is sorted
//
//        int index=-1;
//        for (int i = 0; i <A.length ; i++) {
//
//            if(A[i]==key) return i;
//
//            else if(A[i] < key){
//                index=i;
//            }
//            else{
//                break;
//            }
//        }
//
//        return index+1;
//    }
    int indx;

    public  int findIndex(int[] arr,int low,int high,int key){

        if (high >= low) {
            int mid = (high + low) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                indx = mid;
                return findIndex (arr, mid + 1, high, key);
            } else {
                indx=mid;
                return findIndex (arr, low, mid - 1, key);
            }
        }
        return indx + 1;
    }

    public static void main(String[] args) {

        int[] A={1,4,8,9,11,13,15,16,19,21,24,27};

        InsertedPostionInSortedArray obj=new InsertedPostionInSortedArray();
//
//        int index = obj.findIndex(A, 0, A.length-1, 30);
//
//        System.out.println(index);

        System.out.println(obj.findIndex(A,0,A.length-1,0));



    }
}
