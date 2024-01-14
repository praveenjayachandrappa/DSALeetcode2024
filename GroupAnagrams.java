import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {


    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> res=new ArrayList<>();

        if(strs.length == 0) return res;

        HashMap<String,List<String>> map=new HashMap<>();

        //O(mlogm)
       // m*nlogn
        for (String s:strs){

           char[] sarr=s.toCharArray();

           Arrays.sort(sarr); //nlogn
           String sortedS=String.valueOf(sarr);
           List<String> temp=map.getOrDefault(sortedS,new ArrayList<String>());
          temp.add(s);
          map.put(sortedS,temp);
        }

        for (List<String> list: map.values()){
            res.add(list);
        }

        return res;
    }

    public static void main(String[] args) {


        String[] strs={"eat","tea","tan","ate","nat","bat"};

        GroupAnagrams obj=new GroupAnagrams();

        List<List<String>> anagrams = obj.groupAnagrams(strs);

        anagrams.stream().forEach(e-> System.out.println(e));
    }
}
