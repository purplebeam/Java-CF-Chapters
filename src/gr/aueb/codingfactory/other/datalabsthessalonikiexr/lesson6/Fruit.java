package gr.aueb.codingfactory.other.datalabsthessalonikiexr.lesson6;

public class Fruit {

    String name = "";
    private int weight = 0;
    protected String color;

    public Fruit(int weight, String color) {
        this.weight = weight;
    }

    public void eat() {
        System.out.println("1 Fruit Consumed.");
    }

    void getName() {
        System.out.println("Just " + "a" + color + "a fruit!");
    }
}
