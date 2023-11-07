package gr.aueb.codingfactory.ch2;

public class RandomDemo {
    public RandomDemo() {
    }

    public static void main(String[] args) {
        int die = (int)(Math.random() * 6.0) + 1;
        System.out.println(die);
    }
}
