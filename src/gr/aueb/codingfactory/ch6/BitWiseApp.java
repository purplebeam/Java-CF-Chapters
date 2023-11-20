package gr.aueb.codingfactory.ch6;

public class BitWiseApp {

    public static void main(String[] args) {

    }

    public static boolean XOR(boolean b1, boolean b2){
        return (b1 && !b2) || (!b1 && b2);
    }

    public static int[] complimentByOne(int[] binaryVector){
        int[] binaryOut;
        if(binaryVector == null) return null;

        binaryOut = new int[binaryVector.length];
        for(int i = 0; i< binaryVector.length; i++){
            binaryOut[i] = (binaryVector[i] == 0) ? 1 : 0;
        }
        return binaryOut;
    }
}
