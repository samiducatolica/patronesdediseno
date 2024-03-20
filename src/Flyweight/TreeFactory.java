package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static final Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String species, String color) {
        String key = species + color;
        if (!treeTypes.containsKey(key)) {
            treeTypes.put(key, new TreeType(species, color));
        }
        return treeTypes.get(key);
    }
}