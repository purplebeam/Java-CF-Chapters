package gr.aueb.codingfactory.other.datalabsthessalonikiexr.lesson6;

public class Orange extends Fruit{

    public void squizz(){
        System.out.println("Splash");
    }

    @Override
    void getName() {
        System.out.println("It's an orange");
    }
}
