import java.util.HashSet;

public class LongestSubStringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {

        HashSet<Character> set=new HashSet();

        int l=0;
        int res=Integer.MIN_VALUE;
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            if(set.contains(ch)){
                while(set.contains(ch)){
                    set.remove(s.charAt(l));
                    l++;
                }
            }
                set.add(ch);
                res=Math.max(res,set.size());

        }

        return res;
    }

    public static void main(String[] args) {


       // String s="abcabcbb";

        String s="aab";
        int res = lengthOfLongestSubstring(s);

        System.out.println(res);


    }
}
