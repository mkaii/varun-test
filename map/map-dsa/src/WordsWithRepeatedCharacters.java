import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsWithRepeatedCharacters {


    public static void main(String[] args) {


        String paragraph = "I live in india where calcutta is a metropolitan city.";

        for(String word : paragraph.split(" "))
        {
            Set<Character> alphabetSet = new HashSet<>();

            for(Character alphabet : word.toCharArray())
            {
                alphabetSet.add(alphabet);
            }


            if(alphabetSet.size() != word.length())
            {
                System.out.println(word);
            }
        }
    }
}
