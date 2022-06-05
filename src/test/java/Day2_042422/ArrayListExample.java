package Day2_042422;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main (String[] args) {
        //create an ArrayList for countries
        ArrayList<String> countries = new ArrayList<>();
        countries.add("USA"); // Index 0
        countries.add("Bangladesh"); //Index 1
        countries.add("India"); //Index 2
        countries.add("Canada"); //Index 3
        countries.add("Pakistan"); //Index 4

        System.out.println("My last country is " +countries.get(4) + " and my third country is " + countries.get (2));
        //Index 5 will throw index out of bound exception since there is no value stared at index 5

        //I want to print 4th value from the list
        System.out.println("My last country is " +countries.get(4) + " and my third country is " + countries.get (2));

    }//end of main method
}//end of java class
