package array_lists_basics;

import javax.crypto.BadPaddingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListsBasic {
    public static void main(String[] args) {

        // quick Array reminder
       /* int [] nums = {1,2,3,4,5};
        System.out.println(Arrays.toString(nums));

        System.out.println("empty");

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println("empty");

        for(int num : nums) {
            System.out.print(num + " ");
        }*/

/*
       //  works with nums array cloning
        int nums[] = new int[5];
        nums[0] = 100;
        nums[1] = 101;
        nums[2] = 102;
        nums[3] = 103;
        nums[4] = 104;

        int nums2[] = new int[nums.length + 1]; // for new element

*/
/*
        //List<Integer> list = new ArrayList<>();  // for specific elements Integer(wrapped primitives)
        //List<String> list = new ArrayList<>();   // for specific elements as String
        List list = new ArrayList();               // for all type keeping  elements

        // for adding new elements to the list!
        list.add(11);  // first element [0]
        list.add(12.12); // 1st
        list.add("kevin"); // 2nd
        list.add(true);  // 3rd
        list.add(15);  // last element

        // for printing the list of elements
        System.out.println(list);

        */


  /*      //  With lists order is guaranteed
        List<Integer> list  = new ArrayList<>();

        // add method will take an argument
        list.add(11); // first element [0]
        list.add(12); // 1st
        list.add(13);  // 2nd
        list.add(-2); // last element

        System.out.println(list);
        System.out.println("Size of list: " + list.size());  // Size of list return int as the list(kind of length)

        list.remove(2);
        System.out.println("remove(2 = 13): " + list); // Size of list
        */



/*        List <String> names = new ArrayList<>();
        names.add("Peter Pan");
        names.add("Jason Lee");
        names.add("Mike Lawrence");

        System.out.println(names);
        System.out.println("names arraylist = " + names);

        names.remove(2);  // remove 2nd element
        names.remove("Peter Pan"); // remove an object
        System.out.println(names);*/

        List<String> books = new ArrayList<>();
        books.add("Java for Beginners");
        books.add("Kite Runner");
        books.add("Python for Beginners");
        books.add("Harry Potter");

        String firstBook = books.get(0);
        String lastBook = books.get(books.size() - 1);

        System.out.println("First book is  --> " + firstBook + " , and last is --> " + lastBook);

        // books.get(100); // IndexOutOfBoundsException













    }//end main
}
