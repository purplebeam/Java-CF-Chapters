package gr.aueb.codingfactory.other.datalabsthessalonikiexr.lesson4;

import java.sql.Time;

public class MainTime {

    public static void main(String[] args) {

        TimeClass myTime = new TimeClass(21,00,00);

        myTime.setHour(26);
        myTime.addHour(15);
        myTime.printTime();
    }
}
