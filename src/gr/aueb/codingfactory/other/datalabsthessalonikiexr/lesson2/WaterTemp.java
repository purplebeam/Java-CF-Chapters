package gr.aueb.codingfactory.other.datalabsthessalonikiexr.lesson2;

public class WaterTemp {

    public static void main(String[] args) {
        
        int temperature = 120;
        
        if (temperature <= 0){
            System.out.println("Ice");
        } else if (temperature >= 100) {
            System.out.println("Steam");
        } else if (temperature > 0 && temperature < 100) {
            System.out.println("Water");
        }
    }
}
