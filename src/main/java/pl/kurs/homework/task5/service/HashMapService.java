package pl.kurs.homework.task5.service;

import java.util.HashMap;

public class HashMapService {

    public <K, V> HashMap<K, V> shallowCopyHashMap(HashMap<K, V> original) {
        return (HashMap<K, V>) original.clone();
    }

    public <K, V> void fillHashMap(HashMap<K, V> destination, HashMap<K, V> source) {
        destination.putAll(source);
    }
}
