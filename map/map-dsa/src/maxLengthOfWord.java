public class maxLengthOfWord {

    public static void main(String[] args) {


        String paragraph = "Once I had to get along with some people who could never agree on anything Then our neighbor cut down a tree Instantly we united in mourning It is irresistible to identify with trees Tall emblems of endurance they possess the special allure of being alive but not animate They stay as still as monarchs on their thrones existing at so perfect a distance from us that they create a mythic parallel with our human lives";

        int maximumLength = -1;
        String maxLengthWord = null;

        for(String word : paragraph.split(" "))
        {
            int currWordSize = word.length();
            if(currWordSize > maximumLength)
            {
                maximumLength = currWordSize;
                maxLengthWord = word;
            }
        }

        System.out.println(maxLengthWord  + " : " +  maximumLength);

    }
}
