package gr.aueb.codingfactory.other.datalabsthessalonikiexr.lesson2;

public class SwitchOptions {

    public static void main(String[] args) {

        int option = 6;

        switch (option){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Out of Scope");
                break;
        }
    }
}
