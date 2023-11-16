package gr.aueb.codingfactory.other.datalabsthessalonikiexr.lesson5;

import java.util.Random;

public class Grape {

    Random rnd = new Random();
    private int wine = rnd.nextInt(10);

    public Grape(){
    }
    public Grape(int wine){
        this.wine = wine;
    }

    public int crash() {
        System.out.println("Crashed.");
        System.out.println("Wine Harvested: " + this.wine);
        return this.wine;
    }

}
