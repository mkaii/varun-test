import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //set is an interface

        //hashset is the child class of set

        //list -> linear data structure
        //map -> key value pairs data structure
        //set -> unique elements ka data structure


        Set<Integer> s1 = new HashSet<>();

        // crud

        //create :

        s1.add(2);
        s1.add(3);
        s1.add(4);
        s1.add(5);
        s1.add(2);
        s1.add(3);
        s1.add(4);
        s1.add(5);
        s1.add(2);
        s1.add(3);
        s1.add(4);
        s1.add(5);
        s1.add(2);
        s1.add(3);
        s1.add(4);
        s1.add(5);
        s1.add(2);
        s1.add(3);
        s1.add(4);
        s1.add(5);

        System.out.println(s1);


        System.out.println(s1.size());
        // hash map ke keys unique hote
        // keys -> map.keySet()

        List<Integer> arr = List.of(1,2,3,4,5,6,7,1,2,3,4,5,6,7);

        Set<Integer> s2 = new HashSet<>();

        s2.addAll(arr);

        System.out.println(s2);

        System.out.println(s2.size());

        // removing an element from the set

        s2.remove(2);

        System.out.println(s2);

        System.out.println(s2.size());

        // remove all elements from the set


        s2.clear();

        System.out.println(s2);

        System.out.println(s2.size());

        // read : there is no concept of index or keys in set u can only check if a certain value is there or not

        //Set<Integer> s3 = Set.of(1,2,3,4,5,6);

        Set<Integer> s3 = new HashSet<>();
        s3.add(1);
        s3.add(2);
        s3.add(3);
        s3.add(4);



        System.out.println(s3);

        boolean state =  s3.contains(61);

        System.out.println(state);

        //update
            //remove 6
            // add 8

        // iterate on each element of the set

        for(Integer x : s3)
        {
            System.out.println(x + " ");
        }

        // check if the hashset is empty or not

        s3.clear();

        System.out.println(s3);

        System.out.println(s3.isEmpty());


        List<Integer> numbers = new ArrayList<>(List.of(1,1,1,1,1,1,2,2,2,2,2,3,3,3,3));

        List<Integer> output  = new ArrayList<>();

        Set<Integer> visited = new HashSet<>();


        for(Integer num : numbers)
        {
            if(visited.contains(num))
            {
                continue;
            }
            else {
                output.add(num);
                visited.add(num);
            }
        }


        System.out.println(output);











    }
}