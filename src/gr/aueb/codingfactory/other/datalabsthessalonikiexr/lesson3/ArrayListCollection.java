package gr.aueb.codingfactory.other.datalabsthessalonikiexr.lesson3;

import java.util.ArrayList;

public class ArrayListCollection {

    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<String>();

        myList.add("Konstantinos");
        myList.add("Nikos");
        myList.add("Manolis");

        System.out.println(myList.get(1));
        System.out.println();
        System.out.println(myList);
        System.out.println(myList.size());

        myList.add("Elsa");
        myList.add("Eleni");
        System.out.println(myList);
        System.out.println(myList.size());

        myList.remove(2);

        System.out.println(myList);
        System.out.println(myList.size());

        myList.sort(null);
        System.out.println(myList);

        for (String name : myList){
            System.out.println(name);
            System.out.println(myList.get(3));
        }

    }
}
