package gr.aueb.codingfactory.other.datalabsthessalonikiexr.lesson1;

public class SecGradeEquation {

    public static void main(String[] args) {
        double a = 1;
        double b = 5;
        double c = 4;

        double d = (b*b) - (4*a*b);

        System.out.printf("Δ = %f\n",d);

        if (d>0) {
            double x1 = ((-b) + Math.sqrt(d))/2*a;
            double x2 = ((-b) - Math.sqrt(d))/2*a;
            System.out.printf("\nΔιακρίνουσα μεγαλύτερη του 0\nx1: %f \nx2: %f\n",x1,x2);
        } else if (d==0) {
            double x = (-b)/(2*a);
            System.out.printf("\nΔιακρίνουσα ίση με 0\nx: %f",x);
        } else {
            System.out.println("Δεν έχει λύση");
        }
    }
}
