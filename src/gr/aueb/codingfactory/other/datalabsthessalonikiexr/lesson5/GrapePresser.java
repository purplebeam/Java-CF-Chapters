package gr.aueb.codingfactory.other.datalabsthessalonikiexr.lesson5;

import java.util.ArrayList;

public class GrapePresser {

   private int totalWine = 0;
    public void press(ArrayList<Grape> grapes){
        for (Grape grape : grapes){
            totalWine = totalWine + grape.crash();
            grape.crash();
        }
    }

    public int getTotalWine() {
        return this.totalWine;
    }
}
