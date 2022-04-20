package replit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Repl218 {
    public static void main(String[] args) {
        List<String> deviceNames = new ArrayList<>();
        deviceNames.add("switch");
        deviceNames.add("tv");
        deviceNames.add("switch");
        deviceNames.add("tv");
        deviceNames.add("switch");
        deviceNames.add("tv");

        System.out.println(countDeviceNames(deviceNames));
    }

    public static List<String> countDeviceNames(List<String> deviceNames) {
        List<String> total = new ArrayList<>(deviceNames);

        return total;
    }
}
