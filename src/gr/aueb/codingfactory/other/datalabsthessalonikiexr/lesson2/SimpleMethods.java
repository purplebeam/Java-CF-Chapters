package gr.aueb.codingfactory.other.datalabsthessalonikiexr.lesson2;

public class SimpleMethods {

    public static void main(String[] args) {
        hello();
        int x = 8;
        int y = 4;

        add(x,y);
        int returnedValue = sub(x,y);
        System.out.println(returnedValue);
    }

    public static void hello(){
        System.out.println("Hello");
    }

    public static void add(int num1,int num2){
        System.out.println(num1+num2);
    }

    public static int sub(int num1,int num2){
        return num1-num2;
    }
}
