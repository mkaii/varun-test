import java.util.HashMap;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int []arr = new int[]{4,15,10,12,20,0,5,8, 40, -20}; //n is length

        // first approach
        // using 2 for loops : find all pairs using 2 for loops and see if the pair is a valid pair -> sum is 20

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i] + arr[j] == 20)
                {
                    System.out.println(arr[i] + " " + arr[j] );
                }
            }
        }

        // the time complexity of above solution is n*n

        System.out.println("------------------------------------------");

        //second approach

        /*for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                if(20 - arr[i] == arr[j])
                {
                    System.out.println(arr[i] + " " + arr[j] );
                }
            }
        }*/


        //int []arr = new int[]{4,15,10,12,20,0,5,8, 40, -20}; //n is length

        Map<Integer,Integer> valueToIndexMap = new HashMap<>();

        for(int i=0;i< arr.length;i++)
        {
            valueToIndexMap.put(arr[i],i);
        }

        System.out.println(valueToIndexMap);


        for(int i=0;i<arr.length;i++)
        {
            int value = 20 - arr[i];

            // check if the above value is there in the hashmap
            if(valueToIndexMap.containsKey(value))
            {
                if(valueToIndexMap.get(value)!= i) {
                    System.out.println(arr[i] + " " + value);
                    valueToIndexMap.remove(arr[i]);
                }
            }

        }


    }
}