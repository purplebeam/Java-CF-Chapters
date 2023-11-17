package gr.aueb.codingfactory.other.datalabsthessalonikiexr.lesson4;

public class RoomMain {

    public static void main(String[] args) {

        RoomClass r1 = new RoomClass();
        RoomClass r2 = new RoomClass(5.8,4.2,3);

//        r1.length =5;
//        r1.width = 3;
//        r1.height = 2.7;
//
//        r2.length = 4.89;
//        r2.width = 4.10;
//        r2.height =2.8;

        r1.setLength(4);
        r1.setWidth(3);
        r1.setHeight(2.7);
        System.out.println(r1.getFloorArea());
        System.out.println(r2.getFloorArea());
        System.out.println(r1.getWallArea());
        System.out.println(r2.getWallArea());

    }
}
