import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SubstringWithConcatenationOfWords {
//
//    public static boolean isValid(String s,String[] words){
//        int l=words[0].length();
//        HashMap<String, Integer> count=new HashMap<>();
//        for (String word : words) {
//            count.put(word,count.getOrDefault(word, 0) + 1);
//        }
//        for (int i=0;i<s.length();i+=l) {
//            String sub = s.substring(i,i+l);
//            if (!count.containsKey(sub) || count.get(sub) <= 0) {
//                return false;
//            }
//            count.put(sub,count.get(sub)-1);
//        }
//        return true;
//    }
//    public static List<Integer> findSubstring(String s, String[] words) {
//        int k=words.length * words[0].length();
//        int ws=0;
//        int we=0;
//        List<Integer> ans=new ArrayList<>();
//        StringBuilder str=new StringBuilder();
//        while(we<s.length()){
//            str.append(s.charAt(we));
//            if(str.length()==k){
//                if(isValid(str.toString(),words)){
//                    ans.add(ws);
//                }
//                str.delete(0,1);
//                ws+=1;
//            }
//            we++;
//        }
//        return ans;
//    }
    public static List<Integer> findSubstring(String s, String[] words) {
        if (s.isEmpty() || words.length == 0)
            return new ArrayList<>();

        final int k = words.length;
        final int n = words[0].length();
        List<Integer> ans = new ArrayList<>();
        Map<String, Integer> count = new HashMap<>();

        for (final String word : words)
            count.merge(word, 1, Integer::sum);

        for (int i = 0; i <= s.length() - k * n; ++i) {
            Map<String, Integer> seen = new HashMap<>();
            int j = 0;
            for (; j < k; ++j) {
                final String word = s.substring(i + j * n, i + j * n + n);
                seen.merge(word, 1, Integer::sum);
                if (seen.get(word) > count.getOrDefault(word, 0))
                    break;
            }
            if (j == k)
                ans.add(i);
        }

        return ans;
    }
    public static void main(String[] args) {

        String s="barfoothefoobarman";

        String words[]={"foo","bar"};
        List<Integer> list = findSubstring(s, words);

        System.out.println(list);

    }
}
