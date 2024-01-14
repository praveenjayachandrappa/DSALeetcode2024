import java.util.HashMap;

public class WorkingCodeMinimumWindow {

    public static String minWindow(String s, String t) {

        if(s.equals(t)) return s;

        if(t.length() > s.length()) return "";

        if(t.isEmpty()) return "";

        HashMap<Character,Integer> windowCounts=new HashMap<>();

        HashMap<Character,Integer> countT=new HashMap<>();

        for (char c:t.toCharArray()){
            countT.put(c,countT.getOrDefault(c,0)+1);
        }


        int l=0;

        int have=0,need=countT.size();

        int resLen=Integer.MAX_VALUE;

        int[] res = new int[2];

        for (int r = 0; r <s.length() ; r++) {

            char ch=s.charAt(r);
            int count = windowCounts.getOrDefault(ch, 0);
            windowCounts.put(ch,count+1);

            if(countT.containsKey(ch) && windowCounts.get(ch).intValue() == countT.get(ch).intValue()){
                have+=1;
            }

            while (l<= r && have==need){

                //update the result

                if(r-l+1 < resLen){
                    res= new int[]{l, r};
                    resLen=r-l+1;
                }
                //pop from the left our windowCounts
                char c=s.charAt(l);
                if(windowCounts.containsKey(c)){
                    windowCounts.put(c,windowCounts.get(c)-1);
                }

                if(countT.containsKey(c) && windowCounts.get(c) < countT.get(c)){
                    have-=1;
                }
                l+=1;
            }

        }

        int left=res[0],right=res[1];

        return resLen == Integer.MAX_VALUE ? "" : s.substring(left,right+1);
    }

    public static void main(String[] args) {


        String windowCounts = minWindow("ADOBECODEBANC", "ABC");

        System.out.println(windowCounts);


    }
}
