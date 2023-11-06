package gr.aueb.codingfactory.ch5;

public class CompareWithoutEpsilon {

    public static void main(String[] args) {
        double actual = 0.0;
        double expected = 1.0;
        final double EPSILON = 0.000005;

        for (int i = 1; i <=10; i++){
            actual +=0.1;
        }

//        System.out.printf("Actual: %.20f -- Expected: %.20f\n",actual,expected);
//
//        if (actual == expected){
//            System.out.println("EQUAL");
//        } else {
//            System.out.println("NOT EQUAL");
//        }

        if (Math.abs(actual - expected) <= EPSILON) {
            System.out.println("EQUAL");
            System.out.println(Math.abs(actual - expected));
        } else {
            System.out.println("NOT EQUAL");
        }
    }

}
