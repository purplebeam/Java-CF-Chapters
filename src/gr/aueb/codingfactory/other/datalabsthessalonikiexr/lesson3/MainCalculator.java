package gr.aueb.codingfactory.other.datalabsthessalonikiexr.lesson3;

public class MainCalculator {

    public static void main(String[] args) {

        int select = 4;
        double x = 1;
        double y = 2;
        double result = 0;

        switch (select) {

            case 1:
                result = add(x,y);
                break;
            case 2:
                result = min(x,y);
                break;
            case 3:
                result = mul(x,y);
                break;
            case 4:
                result = div(x,y);
                break;
            default:
                result = 0;
                System.out.println("Wrong Option.");
        }

        System.out.println(result);

    }

    static double add(double num1, double num2){
        return num1+num2;
    }

    static double min(double num1, double num2){
        return num1-num2;
    }

    static double mul(double num1, double num2){
        return num1*num2;
    }

    static double div(double num1, double num2){
        return num1/num2;
    }
}
