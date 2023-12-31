package array;

public class DuplicateTwice {

    public static int removeDuplicates(int[] nums) {
        int prev=nums[0];

        int idx=1;

        boolean isDuplicate=false;

        for(int i=1;i<nums.length;i++){

            if(nums[i]==prev){

                if(!isDuplicate)
                {
                    nums[idx++]=nums[i];
                    isDuplicate=true;

                }
            }
            else{
                nums[idx++]=nums[i];
                isDuplicate=false;
                prev=nums[i];
            }

        }

        return idx;
    }

    public static void main(String[] args) {


        int[] nums={0,0,1,1,1,1,2,2,3,3};

        int removeDuplicates = removeDuplicates(nums);

        System.out.println(removeDuplicates);
    }
}
