package gr.aueb.codingfactory.other.datalabsthessalonikiexr.lesson2;

public class LoopIterations {

    public static void main(String[] args) {

        for(int i=1;i<=10;i++){
            if(i==5){
                continue;
            }
            if(i==9){
                break;
            }
            System.out.println("Hello World " + i);
        }
    }
}
