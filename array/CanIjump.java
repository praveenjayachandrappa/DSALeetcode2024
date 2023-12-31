package array;

public class CanIjump {

    public static boolean canJump(int[] nums) {

        return canIjump(0,nums.length-1,nums);
    }


    private static boolean canIjump(int start,int end,int[] nums){


        if(start > end) return false;

        if(start == end) return true;

        if(nums[start] == 0) return false;

        int jumps=nums[start];

        for(int i=jumps;i>0;i--){
            if(canIjump(start+i,end,nums))
                return true;
        }

        return false;
    }

    public static void main(String[] args) {


        int[] nums={0};

        boolean b = canJump(nums);
        System.out.println(b);
    }
}
