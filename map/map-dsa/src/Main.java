import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // array list
        //List<String> arr = new ArrayList<>();

        //  hashmap
        Map<String,Integer> map = new HashMap<>();

        //crud

        // create : create elements in hashmap : key value pair

        //put method :create , update

        map.put("abc",1);
        map.put("def",2);
        map.put("mainak",5);
        map.put("abc",9);

        System.out.println(map.keySet());

        //read

        System.out.println(map.get("mainak"));

        for(String str : map.keySet())
        {
            System.out.println(str + " "  + map.get(str));
        }

        // delete element from hashmap

        //map.remove("abc"); // removes the key value pair where key -> "abc"

        // whether map has a certain key :

        System.out.println(map.containsKey("mainak"));
        System.out.println(map.containsValue(5));



        System.out.println(map.size());
        System.out.println(map);


        // freq of all elements of an arraylist

        List<Integer> arr = List.of(1,2,3,1,2,3,4,1,1,1,2,2,2,3,3,3,4,5,6);

        List<Integer> visitedElements = new ArrayList<>();

        //1-> 5
        //2-> 5
        //3 -> 5
        //4 -> 2
        //5 -> 1
        // 6->1

        // solve using arraylist

        for(int i=0;i<arr.size();i++)
        {
            if(!visitedElements.contains(arr.get(i))) {
                int count = 1;
                for (int j = i + 1; j < arr.size(); j++) {
                    if (arr.get(i).equals(arr.get(j))) {
                        count++;
                    }
                }

                System.out.println(arr.get(i) + " ka count :" + count);
                visitedElements.add(arr.get(i));
            }
        }



        //hashmap ka solution

        Map<Integer,Integer> freqMap = new HashMap<>();

        for(Integer elem : arr)
        {
            if(freqMap.containsKey(elem))
            {
                Integer count = freqMap.get(elem);
                count++;
                freqMap.put(elem,count);
            }
            else {
                freqMap.put(elem,1);
            }
        }

        System.out.println(freqMap);
    }
}