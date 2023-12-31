public class PermutationString {



    public static void permuteUsingSwamp(String s){

        permuteUsingSwamp(s.toCharArray(),0,s.length()-1);
    }

    private static void permuteUsingSwamp(char[] str, int low, int high) {


        if(low==high){
            System.out.println(new String(str));
            return;
        }
        else {
            for (int i = low; i <= high; i++) {
                swap(str, low, i);
                permuteUsingSwamp(str, low + 1, high);
                swap(str, low, i);
            }
        }

    }

    private static void swap(char[] str, int c, int t) {

        char temp=str[t];
        str[t]=str[c];
        str[c]=temp;
    }


    public static void permute(String s,int start,StringBuilder res,boolean[] visited){

        if(start == s.length()){
            System.out.println(res.toString());
            return;
        }
        else {
            for (int i = 0; i < s.length(); i++) {
                if (visited[i] == false) {
                    res.append(s.charAt(i));
                    visited[i] = true;
                    permute(s, start + 1,res,visited);
                    visited[i] = false;
                    res.deleteCharAt(res.length() - 1);
                }
            }
        }
    }

    public static void main(String[] args) {

        String s="ABC";
        permute(s,0,new StringBuilder(),new boolean[s.length()]);
        System.out.println("Using swamp method ---------------------");
        permuteUsingSwamp(s);
    }
}
