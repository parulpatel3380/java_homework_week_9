package homework_week_9;

import java.util.ArrayList;

/**
 * 11. Declare following two arrylist and compare it.
 ArrayList<String> c1= new ArrayList<String>();
 c1.add("Red");
 c1.add("Green");
 c1.add("Black");
 c1.add("White");
 c1.add("Pink");
 ArrayList<String> c2= new ArrayList<String>();
 c2.add("Red");
 c2.add("Green");
 c2.add("Black");
 c2.add("Pink");

 *
 */

public class Program11_ArrayListComparision {
    public static void main(String[] args) {
        Program11_ArrayListComparision obj = new Program11_ArrayListComparision(); // object creation to call compareTwoArrayList()
        obj.compareTwoArrayList(); // calling compareTwoArrayList()

    }
    public void compareTwoArrayList() // declare compareTwoArrayList() as an instance method
    {
        ArrayList<String> c1 = new ArrayList(); // creating Arraylist
        c1.add("Red"); // adding element to arraylist
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
        //storing the comparision output into arraylist c3
        ArrayList<String> c3 = new ArrayList<>();
        for (String s : c1) {
            c3.add(c2.contains(s) ? "Yes" : "No");

        }
        System.out.println(c3);

    }



}
