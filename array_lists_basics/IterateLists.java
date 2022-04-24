package array_lists_basics;

import java.util.ArrayList;
import java.util.List;

public class IterateLists {
    public static void main(String[] args) {

        List<String> cities = new ArrayList<String>();
        cities.add("NYC");
        cities.add("LA");
        cities.add("Philly");
        cities.add("Chicago");
        cities.add("Fairfax");
        cities.add("SF");
        cities.add("Pittsburgh");
        cities.add("Miami");

        // for all elements in the list
        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i));
        }

        System.out.println("----------------------------------------------------");

        // for taking a specific element
        for (int i = 0; i < cities.size(); i++) {

            if(cities.get(i).startsWith("N")){
                System.out.println("Just start with \"N\" " +cities.get(i));
            }

            if(cities.contains("C")){
                System.out.println(cities.get(i));
            }

        }






    }//end main
}
