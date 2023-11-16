package gr.aueb.codingfactory.other.datalabsthessalonikiexr.lesson4;

public class RoomMain {

    public static void main(String[] args) {

        RoomClass r1 = new RoomClass();
        RoomClass r2 = new RoomClass();

        r1.length =5;
        r1.width = 3;
        r1.height = 2.7;

        r2.length = 4.89;
        r2.width = 4.10;
        r2.height =2.8;

        System.out.println(r1.getArea());
        System.out.println(r2.getArea());

    }
}
