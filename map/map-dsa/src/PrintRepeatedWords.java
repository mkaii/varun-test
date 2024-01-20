import java.util.HashMap;
import java.util.Map;

public class PrintRepeatedWords {

    public static void main(String[] args) {


        //Find duplicate words from string


        //hashmap way


        String paragraph = "test automation is is good to have and and test skill";

        Map<String, Integer> freqMap = new HashMap<>();

        for(String word : paragraph.split(" "))
        {
            if(freqMap.containsKey(word))
            {
                Integer  prevCount = freqMap.get(word);
                freqMap.put(word,prevCount+1);
            }
            else {
                freqMap.put(word,1);
            }
        }

        System.out.println(freqMap);

        for (String word : freqMap.keySet())
        {
            if(freqMap.get(word) > 1)
            {
                System.out.println(word);
            }
        }


    }
}
