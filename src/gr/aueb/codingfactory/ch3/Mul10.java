package gr.aueb.codingfactory.ch3;

public class Mul10 {

    public static void main(String[] args) {
        // το 1 είναι το ουδέτερο στοιχείο του πολ/σμού
        int result = 1;
        int i = 1;

        while(i <=10){
            result = result *i; // ή result *=i;
            i++;
        }

        System.out.println("Result = " + result);
    }
}
