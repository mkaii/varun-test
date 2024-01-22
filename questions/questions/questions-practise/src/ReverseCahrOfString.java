public class ReverseCahrOfString {


    static boolean isElementAlphabet(char ch)
    {
        return ((ch >= 'a' && ch <= 'z') || (ch >='A' && ch <= 'Z'));
    }

    public static void main(String[] args) {


        String str = "Varun789#$abc";

        char[] charArray = str.toCharArray();

        //output : cba$#987nuraV

        int n = str.length();
       /* for(int i=0;i< n/2;i++)
        {
            int j = n-i-1;

            char temp = charArray[i];
            charArray[i] =  charArray[j];
            charArray[j] = temp;
        }*/

        int i=0,j=n-1;

        while(i<j)
        {
            if(isElementAlphabet(charArray[i]) && isElementAlphabet(charArray[j])) {
                char temp = charArray[i];
                charArray[i] = charArray[j];
                charArray[j] = temp;
                i++;
                j--;
            }
            else if (!isElementAlphabet(charArray[i]))
            {
                i++;
            }
            else {
                j--;
            }
        }

        str = new String(charArray);

        System.out.println(str);


    }
}
