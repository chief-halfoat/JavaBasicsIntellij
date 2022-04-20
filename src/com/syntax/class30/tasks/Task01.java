package com.syntax.class30.tasks;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

//Create a map of a building. Store floor number and it is associated company name.
// (Example: 1= Google, 2=Syntax etc..)
// Insert 7 entries with duplicate keys and values.
//Check how many entries you have?
//Update company on a 4th floor
//Remove company on the 7th floor
//Print your map
public class Task01 {
    public static void main(String[] args) {

        //creating a TreeMap to store floor numbers and company names. Using TreeMap so entries can be added in any
        //order and still be listed in numerical order by floor
        Map<Integer,String> building = new TreeMap<>();
        //adding floor no. and company name, not in order, including duplicate keys & values
        building.put(1,"Google");
        building.put(1,"Google");
        building.put(2,"Syntax");
        building.put(2,"Syntax");
        building.put(6,"Yahoo!");
        building.put(6,"Yahoo!");
        building.put(4,"Nike");
        building.put(4,"Nike");
        building.put(5,"Reebok");
        building.put(5,"Reebok");
        building.put(3,"Tj's");
        building.put(3,"Tj's");
        building.put(7,"Clock");
        building.put(7,"Clock");
        //getting building size
        System.out.println(building.size());

        System.out.println("Floor 4 (before update): "+building.get(4));
        //replacing floor 4
        building.put(4,"Puma");
        System.out.println("Floor 4 (after update): "+building.get(4));
        System.out.println("Building before removing Floor 7"+building);
        //removing floor 7
        building.remove(7);
        System.out.println("Building after removing Floor 7"+building);
    }
}
