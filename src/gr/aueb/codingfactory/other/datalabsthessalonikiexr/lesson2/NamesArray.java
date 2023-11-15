package gr.aueb.codingfactory.other.datalabsthessalonikiexr.lesson2;

public class NamesArray {

    public static void main(String[] args) {

        String[] names = new String[5];

        names[0] = "Konstantinos";
        names[1] = "Maria";
        names[2] = "Eleni";
        names[3] = "Nikos";
        names[4] = "Giannis";

        for(int i=0; i< names.length; i++){
            System.out.println(names[i]);
        }

        for(String enchanced : names ){
            System.out.println(enchanced);
        }

    }
}
