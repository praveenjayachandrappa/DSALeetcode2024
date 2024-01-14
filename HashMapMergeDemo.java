import java.util.HashMap;

public class HashMapMergeDemo {

    public static void main(String[] args) {


        HashMap<String,Integer> countMap=new HashMap<>();

        countMap.put("praveen",30);
        countMap.put("pooja",25);

        String[] words={"praveen","pooja","akash","kiran","andy","andy"};

        for (String word:words
             ) {
            countMap.merge(word,1,Integer::sum);
        }

        System.out.println(countMap.toString());
    }
}
