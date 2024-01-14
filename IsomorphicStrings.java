import java.util.HashMap;

public class IsomorphicStrings {

    public static boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length()) return false;


        HashMap<Character,Character> map=new HashMap<>(); // n

        HashMap<Character,Character> tmap=new HashMap<>(); //n

        //O(n)

        for (int i = 0; i <s.length() ; i++) {

            char sch=s.charAt(i);

            char tch=t.charAt(i);

            if(map.containsKey(sch)){

                if(map.get(sch)!=tch) return false;
            }
            else if(tmap.containsKey(tch)){

                if(tmap.get(tch)!=sch) return false;
            }
            else {
                map.put(sch, tch);
                tmap.put(tch,sch);
            }
        }

        return true;
    }

    public static void main(String[] args) {


        String s="paper";

        String t="title";

        boolean isomorphic = isIsomorphic(s, t);

        System.out.println(isomorphic);

        System.out.println(isIsomorphic("egg","add"));

        System.out.println(isIsomorphic("foo","bar"));

        System.out.println(isIsomorphic("badc","baba"));
    }
}
