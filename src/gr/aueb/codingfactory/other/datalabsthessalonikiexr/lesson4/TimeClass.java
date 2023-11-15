package gr.aueb.codingfactory.other.datalabsthessalonikiexr.lesson4;

public class TimeClass {

    private int hour = 0;
    private int minutes = 0;
    private int seconds = 0;

    TimeClass(int aHour, int aMinutes, int aSec) {
        hour = aHour;
        minutes = aMinutes;
        seconds = aSec;
    }

    public void setHour(int aHour) {
        if (aHour >= 24 || aHour < 0) {
            System.out.println("Denied.");
        } else {
            this.hour = aHour;
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void addHour(int aHour) {
        this.hour = this.hour + aHour;
        if (this.hour > 24) {
            this.hour = this.hour % 24;
        }
    }

    void printTime() {
        System.out.println(this.hour + ":" + this.minutes + ":" + this.seconds);
    }
}
