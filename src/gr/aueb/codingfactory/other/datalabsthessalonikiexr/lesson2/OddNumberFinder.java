package gr.aueb.codingfactory.other.datalabsthessalonikiexr.lesson2;

public class OddNumberFinder {
    public static void main(String[] args) {
        boolean is_prime = true;
        for(int  i = 1; i<=100; i++){
            is_prime = true;

            if (i==2) {
                continue;
            }
            for(int j = 2; j<i; j++){

                if(i%j == 0){
                    is_prime = false;
                    break;
                }
            }
            if(is_prime){
                System.out.println(i);
            }
        }


    }
}
