import java.util.HashMap;

public class RomanToInteger {


    public static int romanToInt(String s) {

        HashMap<Character,Integer> map=new HashMap<>();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
//The key intuition lies in the fact that in Roman numerals,
// when a smaller value appears before a larger value, it represents subtraction, while when a smaller value appears after or equal to a larger value, it represents addition.
   //IX -substraction
   //XI-additon
        int res=0;
        for (int i = 0; i < s.length(); i++) {

            if (i <= s.length() - 2 && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {

                res = res - map.get(s.charAt(i));
            } else {

                res = res + map.get(s.charAt(i));
            }
        }


        return res;
    }

    public static void main(String[] args) {
//
//        String s = "VXIII";

        String s="XI";

        int romanToInt = romanToInt(s);

        System.out.println(romanToInt);

    }

}
