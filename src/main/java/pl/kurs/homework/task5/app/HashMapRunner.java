package pl.kurs.homework.task5.app;

import pl.kurs.homework.task5.service.HashMapService;

import java.util.HashMap;

public class HashMapRunner {
    public static void main(String[] args) {
        HashMapService hashMapService = new HashMapService();

        HashMap<String, String> brandModel = new HashMap<>();
        brandModel.put("Audi", "Q8");
        brandModel.put("BMW", "5er");
        brandModel.put("Citroen", "C5");
        brandModel.put("Ford", "Ka");
        brandModel.put("Honda", "Civic");

        HashMap<String, String> brandModel2 = new HashMap<>();
        brandModel2.put("KIA", "Sportage");
        brandModel2.put("Mazda", "626");
        brandModel2.put("Nissan", "GTR");

        HashMap<String, String> copyBrandModel = hashMapService.shallowCopyHashMap(brandModel);

        System.out.println(brandModel);
        System.out.println(copyBrandModel);

        hashMapService.fillHashMap(brandModel, brandModel2);

        System.out.println(brandModel);
    }
}
