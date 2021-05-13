package main.implementation.hashmap;

import java.util.HashMap;
import java.util.Map;

/* ========================================
Worst Case Time Complexity
Access N/A
Search O(n)
Insertion O(n)
Deletion O(n)
 ======================================== */

public class HashTableLibrary {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();

        map.put(1,3); //Adding a key, value pair [O(1)]
        map.put(2,4); //Adding a key, value pair [O(1)]
        System.out.println(map.get(1)); //Finding the value of key [O(1)]
        map.containsKey(1); //Find if the key is present [O(1)]
        map.containsKey(2); //Find if the key is present [O(1)]
        System.out.println(map.size());   //Getting the size of the hashmap [O(1)]
        map.remove(1); //Remove from the map [O(1)]

        System.out.println(map);
    }
}
