import java.util.HashMap;

public class MinimumStepsTomakeAnagram {

//    public static int minSteps(String s, String t) {
//
//
//        HashMap<Character,Integer> need=new HashMap<>();
//
//        HashMap<Character,Integer> have=new HashMap<>();
//
//
//        for (int i = 0; i <s.length() ; i++) {
//
//            char ch=s.charAt(i);
//            int cnt=need.getOrDefault(ch,0)+1;
//            need.put(ch,cnt);
//        }
//
//
//        for (int i = 0; i <t.length() ; i++) {
//
//            char ch=t.charAt(i);
//            int cnt=have.getOrDefault(ch,0)+1;
//            have.put(ch,cnt);
//        }
//
//        int ans=0;
//        for (char key:need.keySet()
//             ) {
//
//            int required=need.get(key);
//
//            if(have.containsKey(key) && have.get(key)< required)
//            {
//                ans+=required-have.get(key);
//            }
//            else if(!have.containsKey(key)){
//                ans+=required;
//            }
//        }
//
//        return ans;
//    }

    public static int minSteps(String s, String t) {

        int[] count=new int[26];

        for (int i = 0; i <s.length() ; i++) {

            count[t.charAt(i)-'a']++;
            count[s.charAt(i)-'a']--;
        }

        int ans=0;
        for (int i = 0; i <26 ; i++) {

            ans+=Math.max(0,count[i]);
        }

        return ans;
    }

    public static void main(String[] args) {


        String s="bab";

        String t="aba";

        System.out.println(minSteps(s,t));


        System.out.println(minSteps("leetcode","practice"));
    }
}
