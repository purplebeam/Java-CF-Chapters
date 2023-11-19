package gr.aueb.codingfactory.other.datalabsthessalonikiexr.lesson6;

public class Orange extends Fruit {

    public Orange(int weight) {
        super(weight, "Orange");
    }

    public void squizz() {
        System.out.println("Splash");
    }

    @Override
    void getName() {
        System.out.println("It's " + color + "an orange");
    }
}
