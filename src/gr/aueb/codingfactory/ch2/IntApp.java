package gr.aueb.codingfactory.ch2;

public class IntApp {
    public IntApp() {
    }

    public static void main(String[] args) {
        System.out.printf("Type: %s,\t Size: %2d, Min: %,d, Max: %,d\n", Integer.TYPE, 32, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("Type: %s,\t Size: %2d, Min: %d, Max: %d\n", Byte.TYPE, 8, -128, 127);
        System.out.printf("Type: %s,\t Size: %2d, Min: %,d, Max: %,d\n", Short.TYPE, 16, Short.MIN_VALUE, 32767);
        System.out.printf("Type: %s,\t Size: %2d, Min: %,d, Max: %,d\n", Long.TYPE, 64, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}
