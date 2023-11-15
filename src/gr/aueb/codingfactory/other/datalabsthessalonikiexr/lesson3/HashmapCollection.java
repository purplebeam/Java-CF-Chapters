package gr.aueb.codingfactory.other.datalabsthessalonikiexr.lesson3;

import java.util.HashMap;

public class HashmapCollection {

    public static void main(String[] args) {

        HashMap<String,String> map = new HashMap<String,String>();

        map.put("Athens","Greece");
        map.put("Rome","Italy");

        System.out.println(map.get("Athens"));
    }
}
