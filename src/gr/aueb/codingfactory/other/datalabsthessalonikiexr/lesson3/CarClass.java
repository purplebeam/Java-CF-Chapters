package gr.aueb.codingfactory.other.datalabsthessalonikiexr.lesson3;

public class CarClass {

    int passengers = 0;
    double fuel = 0;

    void start(){
        System.out.println("Engine Ready.");
        fuel--;
    }

    void setFuel(double liters){
        fuel += liters;
        System.out.printf("Fuel added: %.2f, new capacity: %.2f L\n",liters,fuel);
    }
}
