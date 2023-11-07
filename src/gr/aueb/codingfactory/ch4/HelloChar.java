package gr.aueb.codingfactory.ch4;

/**
 * Demonstration. Declare, init chars.
 */
public class HelloChar {
    public static void main(String[] args) {
        char star = '*';
        char alpha = 'a';
        char upperAlpha = 'A';
        char dot = '.';
        char bang = '!';
        final char EMPTY_SPACE = ' ';
        int hash = '#';

        System.out.println((int)star);
        System.out.println(alpha);
        System.out.println(dot);

        System.out.println("Hash:" + hash);

        if (alpha > upperAlpha){
            System.out.println("alpha is greater than A");
        } else {
            System.out.println("A is greater than a");
        }
    }
}
