package binarySearch.question6;

import java.util.HashMap;
import java.util.TreeMap;

class TimeMap {
    HashMap<String, TreeMap<Integer, String>> map; 
    public TimeMap() {
        map = new HashMap<>();
    }
    public void set(String key, String value, int timestamp) {
        map.put(key, map.getOrDefault(key, new TreeMap<>()));
        map.get(key).put(timestamp, value);
    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) {
            return "";
        }
        return map.get(key).floorEntry(timestamp) == null ? "" : map.get(key).floorEntry(timestamp).getValue();
    }
}


public class TimeKey {
    public static void main(String[] args) {
        TimeMap timeMap = new TimeMap();
        timeMap.set("alice", "happy", 1);  // store the key "alice" and value "happy" along with timestamp = 1.
        timeMap.get("alice", 1);           // return "happy"
        timeMap.get("alice", 2);           // return "happy", there is no value stored for timestamp 2, thus we return the value at timestamp 1.
        timeMap.set("alice", "sad", 3);    // store the key "alice" and value "sad" along with timestamp = 3.
        timeMap.get("alice", 3);           // return "sad"
    }
}
