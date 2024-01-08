import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        //arraylist

        ArrayList<Integer> arr  = new ArrayList<>();
        arr.add(55);
        arr.add(11);

        // using runtime polymorphism :
        // a parent can point to a child object

        List<Integer> arr1 = new ArrayList<>(); // this is a better way of creating objects


        // size of the arraylist

        System.out.println(arr1.size());

        //adding elements to this list arr1
        arr1.add(12);

        System.out.println(arr1.size());
        System.out.println(arr1);

        arr1.add(14);

        System.out.println(arr1.size());
        System.out.println(arr1);

        arr1.add(1,13);

        System.out.println(arr1.size());
        System.out.println(arr1);

        arr1.addAll(arr); // this means put all the copy of elements from arr into arr1


        System.out.println(arr.size());
        System.out.println(arr);

        System.out.println(arr1.size());
        System.out.println(arr1);


        arr1.addAll(1,arr);


        System.out.println(arr.size());
        System.out.println(arr);

        System.out.println(arr1.size());
        System.out.println(arr1);


        // removing elements from an arraylist

        System.out.println("removing elements from an arraylist");

        System.out.println(arr1);

        System.out.println(arr1.size());

        System.out.println("removing based on index");

        //arr1.remove(2);

        //trick the remove method into thinking that u are passing an object of Integer class instead of passing int

        arr1.remove(Integer.valueOf(12));// new Integer(12)
        System.out.println(arr1.size());

        System.out.println(arr1);

        //

        List<String> arrStr = new ArrayList<>();
        arrStr.add("abc");
        arrStr.add("dbc");
        arrStr.add("ebc");
        arrStr.add("dbc");

        System.out.println(arrStr);
        System.out.println(arrStr.size());

        //index based :

        //arrStr.remove(3);

        arrStr.remove("dbc");

        //arrStr.removeAll("dbc"); something like this is not possible

        System.out.println(arrStr);
        System.out.println(arrStr.size());

        //arrStr.clear();

        System.out.println(arrStr);
        System.out.println(arrStr.size());


        //System.out.println(arrStr.get(2));
        //System.out.println(arrStr.get(3));


        arrStr.set(0, "mainak");

        System.out.println(arrStr);
        System.out.println(arrStr.size());

        //arrStr.clear();

        System.out.println(arrStr.isEmpty());

        System.out.println(arrStr.contains("mainffddak"));

        System.out.println(arrStr.indexOf("ebcubnrb"));


    }
}