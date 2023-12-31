public class IntegerToRoman {
    public static String intToRoman(int num) {

        String[] units={"","I","II","III","IV","V","VI","VII","VIII","IX","X"};  // O TO 10

        String[] tens={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC","C"};  //10 TO 100

        String[] hunds={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM","M"}; //100 TO 1000

        String[] thus={"","M","MM","MMM"}; //1000 TO 3000


        return thus[num /1000]+hunds[(num%1000)/100]+tens[(num%100)/10]+units[num%10];

    }

    public static void main(String[] args) {


        System.out.println(intToRoman(3));

        System.out.println(intToRoman(58));

        System.out.println(intToRoman(1994));

    }
}
