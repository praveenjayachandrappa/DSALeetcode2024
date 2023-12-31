package array;

import java.util.Arrays;

public class RemoveOccurenceOfElement {

    public static int removeElement(int[] nums, int val) {

        int k=0;

        int i=0;

        while (i < nums.length) {

            if(nums[i] == val){
                //nums[i] = i + 1 < nums.length ? nums[i + 1] : -1;
                nums[i]=-1;
                k++;
            }
            else{
                i++;
            }
        }
        int low=0;

        int high=nums.length-1;

        while (low<=high){

            if (nums[low] == -1) {

                while (high >=0 && nums[high] == -1){
                    high--;
                }

                nums[low]=high >=0 ? nums[high] : -1;
                high--;
            }
            low++;
        }

        return nums.length-k;
    }

    public static void main(String[] args) {

//        int[] nums={0,1,2,2,3,0,4,2};
//
//        int val=2;

        int[] nums={1};

        int val=1;

        int k = removeElement(nums, val);

        System.out.println(k);

        System.out.println(Arrays.toString(nums));
    }
}
