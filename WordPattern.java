import java.util.HashMap;

public class WordPattern {

    public boolean wordPattern(String pattern, String s) {

        //I know s is non-empty word

        HashMap<Character,String> map=new HashMap<>();
        String[] words = s.split("\\s");

        if(words.length != pattern.length()) return false;
        int idx=0;
        for (int i = 0; i <pattern.length(); i++) {

            char ch=pattern.charAt(i);

            String smap=map.getOrDefault(ch,"");

            if(smap.isEmpty() && !map.containsValue(words[idx])) {
                smap = words[idx++];
                map.put(ch, smap);
            }
            else if(!smap.equals(words[idx++])){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String pattern="abba";

        String word="dog dog dog dog dog";

        WordPattern obj=new WordPattern();

        boolean b = obj.wordPattern(pattern, word);
        System.out.println(b);

    }
}
