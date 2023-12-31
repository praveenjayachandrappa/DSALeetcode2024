package array;

public class RemoveDuplicatesFromArray {

    //Remove Duplicates from sorted array

    /**
     * Given an integer array nums sorted in non-decreasing order,
     * remove the duplicates in-place such that each unique element appears only once.
     *  The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
     */

    public static int removeDuplicates(int[] nums) {


        int k=1;

        int pos=0;

        for (int i = 1; i <nums.length ; i++) {

            while (i < nums.length && nums[i] ==  nums[i-1]){

                i++;
            }


            if(i < nums.length){
                k++;
                nums[pos+1]=nums[i];
                pos++;
            }
        }

        return k;
    }

    public static void main(String[] args) {

        int[] nums={0,0,1,1,1,2,2,3,3,4};

        int removeDuplicates = removeDuplicates(nums);

        System.out.println(removeDuplicates);

        for (int i = 0; i <removeDuplicates ; i++) {

            System.out.println(nums[i]);
        }
    }
}
