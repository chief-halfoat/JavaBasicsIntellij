package replit;
//Count the number of repetitions of words in an ArrayList
// append that count and return that list.
// You need to implement a function countDeviceNames that takes
// an ArrayList as an input and returns an ArrayList

//input ["switch","tv","switch","tv","switch","tv"]
//output [switch, tv, switch1, tv1, switch2, tv2]
//In this example as word switch is repeated we pick the next entry where it is repeated and append the count i.e how many times that word was present previously
//More Exmaples
//input ["switch","tv","switch","tv","switch","tv","radio"]
//output [switch, tv, switch1, tv1, switch2, tv2, radio]
//input ["switch","tv","switch","tv"]
//output [switch, tv, switch1, tv1]
//if words are not repeated we get the same output
//input ["switch","tv"]
//output [switch, tv]
import java.util.*;

public class Repl218 {
    public static void main(String[] args) {
        List<String> deviceNames = new ArrayList<>();
        deviceNames.add("switch");
        deviceNames.add("tv");
        deviceNames.add("switch");
        deviceNames.add("tv");
        deviceNames.add("switch");
        deviceNames.add("tv");

        List<String> deviceNames2 = new ArrayList<>();
        //input ["switch","tv","switch","tv","switch","tv","radio"]
        deviceNames2.add("switch");
        deviceNames2.add("tv");
        deviceNames2.add("switch");
        deviceNames2.add("tv");
        deviceNames2.add("switch");
        deviceNames2.add("tv");
        deviceNames2.add("radio");
        //input ["switch","tv","switch","tv"]
        List<String> deviceNames3 = new ArrayList<>();
        deviceNames3.add("switch");
        deviceNames3.add("tv");
        deviceNames3.add("switch");
        deviceNames3.add("tv");


        System.out.println(countDeviceNames(deviceNames));
        System.out.println(countDeviceNames(deviceNames2));
        System.out.println(countDeviceNames(deviceNames3));
    }

    public static List<String> countDeviceNames(List<String> deviceNames) {
        //creating a map to hold the String and a count
        Map<String, Integer> holder = new LinkedHashMap<>();
        //creating a loop to iterate through the List of device names
        for (int i = 0; i < deviceNames.size(); i++) {
            //checking to see if the deviceName in the loop is already in the Map
            if(holder.containsKey(deviceNames.get(i))){
                //if the deviceName is already in the map, use the key to increment the count
                holder.put(deviceNames.get(i),holder.get(deviceNames.get(i))+1);
                //creating a SB with the deviceName
                StringBuilder str = new StringBuilder(deviceNames.get(i));
                //taking the deviceName and appending the count to it
                //so if it is the second instance of the String, the loop will increment the count from 0 to 1
                //and append the count to the deviceName
                str.append(holder.get(deviceNames.get(i)));
                //change the SB to a String and swap it into the List
                deviceNames.set(i, str.toString());
            } else {
                //if the map didn't already hold the deviceName as a key, it adds it and starts the count at 0
                holder.put(deviceNames.get(i),0);
            }
        }
        return deviceNames;
    }
}
