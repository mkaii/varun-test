import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {

    public static void main(String[] args) {


        //List<Integer> arr = List.of(1,2,3,1,2,3,1,2,3,4,5,6);
        List<Integer> arr = new ArrayList<>(List.of(1,2,3,1,1,3,1,2,3,4,5,6));

        // remove duplicates :

        //varun's solution

        for(int i=0;i<arr.size()-1;i++)
        {
            int currentValue = arr.get(i);
            for(int j=i+1;j <arr.size();j++)
            {
                int valueToCompare = arr.get(j);

                if(currentValue == valueToCompare)
                {
                    arr.remove(j);
                    j--;
                }
            }
        }

        System.out.println(arr);

        int num = 41;

        System.out.println(arr.indexOf(6));

        // find the index of a give element in the arraylist [1, 2, 3, 4, 5, 6] ,num = 6


        /*int index = -1;
        for(int i=0;i<arr.size();i++)
        {
            if(arr.get(i) == num)
            {
                //System.out.println(i);
                index = i;
            }

        }

        System.out.println(index);*/

    int s = 0,e = arr.size()-1;
    int index = -1;
    while(s<=e)
    {
        int mid = (s+e)/2;

        if(arr.get(mid) == num)
        {
            index = mid;
            break;
        }
        else if(arr.get(mid) > num)
        {
            e = mid-1;
        }
        else {
            s= mid+1;
        }
    }

        System.out.println(index);







        //output arr -> {1,2,3,4,5,6}

    }
}
