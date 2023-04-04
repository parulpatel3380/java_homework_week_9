package homework_week_9;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 6. Write a Java program to retrieve an element (at a specified index) from a given
 array list
 */
public class Program6_RetriveArrayList {
    public static void main(String[] args) // declaring main method
    {
        Program6_RetriveArrayList obj = new Program6_RetriveArrayList(); // creating an object to call retriveFromArrayList()
        obj.retriveFromArrayList(); // calling retriveFromArrayList()

    }

    public void retriveFromArrayList() // declaring retriveFromArrayList() as an instance method
    {
        ArrayList<String> country = new ArrayList<>();
        //adding element to  country Array list
        country.add("India");
        country.add("United Kingdom");
        country.add("USA");
        country.add("Canada");
        country.add("New Zealand");
        country.add("Australia");
        country.add("France");

        Iterator<String> countryName = country.iterator();
        while (countryName.hasNext()) {
            System.out.println(countryName.next());
        }
        System.out.println("The value at 1st index : " + country.get(1)); // retrieving element at given index from ArraList
        System.out.println("The value at 3rd index : " + country.get(3));
        System.out.println("The value at 0 index : " + country.get(0));

    }
}




