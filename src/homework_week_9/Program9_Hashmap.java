package homework_week_9;

import java.util.HashMap;
import java.util.Map;

/**
 * 9. Create a HashMap object called people that will store String keys and Integer
  values: And use for each loop to iterate the value from Map.
 */
public class Program9_Hashmap {
    public static void main(String[] args) {
        Program9_Hashmap obj = new Program9_Hashmap(); // object creation to call hashMapObject()
        obj.hashMapObject(); // calling hashMapObject()

    }
    public void hashMapObject() // declaring hashMapObject() as an instance method
    {
        Map<String, Integer> people = new HashMap<>(); // creating map

        people.put("Alpha", 1); // adding element to map
        people.put("Beta", 2);
        people.put("Gama", 3);
        people.put("Lambda", 4);
        // logic for iterating the values from map
        for (Map.Entry<String, Integer> map : people.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue()); // output

        }
    }

}
