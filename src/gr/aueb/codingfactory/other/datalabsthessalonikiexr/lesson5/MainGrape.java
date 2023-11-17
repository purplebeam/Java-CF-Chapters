package gr.aueb.codingfactory.other.datalabsthessalonikiexr.lesson5;

import java.util.ArrayList;

public class MainGrape {

    public static void main(String[] args) {


        ArrayList<Grape> grapes = new ArrayList<Grape>();

        grapes.add(new Grape(5));
        grapes.add(new Grape(5));
        grapes.add(new Grape(5));
        grapes.add(new Grape(20));
        grapes.add(new Grape(10));

        for(int i=0; i<100; i++){
            grapes.add(new Grape());
        }

        GrapePresser presser = new GrapePresser();

        presser.press(grapes);

        System.out.println("Total Wine Harvest: " + presser.getTotalWine());
    }
}
