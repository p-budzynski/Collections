package pl.kurs.homework.task6.service;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapService {

    public <K, V> K getNextKey(TreeMap<K, V> treeMap, K key) {
        return treeMap.ceilingKey(key);
    }

    public <K, V> SortedMap<K, V> subMapGreaterOrEqual(TreeMap<K, V> treeMap, K key) {
        return treeMap.tailMap(key);
    }

}
