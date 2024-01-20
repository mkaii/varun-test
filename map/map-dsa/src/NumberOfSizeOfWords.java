import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberOfSizeOfWords {


    public static void main(String[] args) {


        String paragraph = "Once I had to get along with some people who could never agree on anything Then our neighbor cut down a tree Instantly we united in mourning It is irresistible to identify with trees Tall emblems of endurance they possess the special allure of being alive but not animate They stay as still as monarchs on their thrones existing at so perfect a distance from us that they create a mythic parallel with our human lives";
        Map<Integer, List<String>> sizeToWordsMap = new HashMap<>();


        for(String word : paragraph.split(" "))
        {
           // System.out.println(word);

            int sizeOfWord = word.length();

            if(sizeToWordsMap.containsKey(sizeOfWord))
            {
                List<String> words = sizeToWordsMap.get(sizeOfWord);
                words.add(word);
            }
            else {
                List<String> words = new ArrayList<>();
                words.add(word);
                sizeToWordsMap.put(sizeOfWord,words);
            }
        }


        /*for(Integer size : sizeToWordsMap.keySet())
        {
            System.out.println(size + " " + sizeToWordsMap.get(size));
        }*/


        for(int sizeOfWord = 1; sizeOfWord <=100 ;sizeOfWord++)
        {
            List<String> words =  sizeToWordsMap.get(sizeOfWord);
            if(words!=null) {
                System.out.println(words + " - count of " + sizeOfWord + " size words are : " + words.size());
            }

        }
    }
}
