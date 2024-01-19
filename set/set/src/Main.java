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


        





    }
}