package gr.aueb.codingfactory.other.datalabsthessalonikiexr.lesson3;

import java.util.Random;

public class RandomMaxMin {

    public static void main(String[] args) {

        int[] numbers = new int[100];
        int max = numbers[0];
        int min = numbers[0];


        Random rnd = new Random();

        for(int i=1; i< numbers.length; i++){
            numbers[i] = rnd.nextInt(1000);
            System.out.println(numbers[i]);
        }

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i]>max){
                max = numbers[i];
            }

            if(numbers[i]<min){
                min = numbers[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
