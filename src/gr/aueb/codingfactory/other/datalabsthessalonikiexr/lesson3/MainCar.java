package gr.aueb.codingfactory.other.datalabsthessalonikiexr.lesson3;

public class MainCar {

    public static void main(String[] args) {

        int x = 5;

        CarClass ford = new CarClass();
        CarClass bmw = new CarClass();

        ford.passengers = 5;
        bmw.passengers = 4;

        ford.fuel = 35;
        bmw.fuel = 45;

        System.out.printf("Ford Passengers: %d\nFord Fuel: %.2f\n",ford.passengers,ford.fuel);
        System.out.printf("Bmw Passengers: %d\nBmw Fuel: %.2f\n",bmw.passengers,bmw.fuel);

        ford.start();
        bmw.start();
        System.out.printf("Fuel status [ford] : %.2f\n",ford.fuel);
        System.out.printf("Fuel status [bmw] : %.2f\n",bmw.fuel);

        ford.setFuel(5);
        bmw.setFuel(5);

    }

}
