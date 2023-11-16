package gr.aueb.codingfactory.other.datalabsthessalonikiexr.lesson4;

public class RoomClass {

    private double length = 0;
    private double width = 0;
    private double height = 0;

    public RoomClass(double aLength, double aWidth, double aHeight) {
        length = aLength;
        width = aWidth;
        height = aHeight;
    }

    public RoomClass(){

    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getFloorArea() {
        return length * width;
    }

    public double getWallArea(){
        return (length*height*2) + (width*height*2);
    }
}
