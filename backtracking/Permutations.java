package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    List<List<Integer>> res;
    public List<List<Integer>> permute(int[] nums) {

       res =new ArrayList<>();

        findPermutations(nums,new ArrayList<>());

        return res;
    }

    private void findPermutations(int[] nums,List<Integer> temp){

        if(temp.size() == nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i <nums.length ; i++) {

            if(temp.contains(nums[i]))
                continue;

            temp.add(nums[i]);
            findPermutations(nums,temp);
            temp.remove(temp.size()-1);
        }
    }
}
