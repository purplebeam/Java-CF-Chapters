package gr.aueb.codingfactory.other.datalabsthessalonikiexr.lesson6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Fruit f1 = new Fruit();
        Orange o1 = new Orange();

        f1.eat();
        o1.eat();
        o1.squizz();

        ArrayList<Fruit> fruits = new ArrayList<>();
        
        fruits.add(f1);
        fruits.add(o1);

        for (Fruit fruit: fruits) {
            fruit.eat();
            fruit.getName();
        }

    }
}
