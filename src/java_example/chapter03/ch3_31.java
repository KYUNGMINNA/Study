package java_example.chapter03;

public class ch3_31 {
    public static void main(String[] args) {
        int dec=1234;
        int hex=0xABCD;
        int mask=0xF;

        System.out.printf("%X",hex);

        System.out.printf("%X%n",hex&mask);

        hex=hex>>4;
        System.out.printf("%X%n",hex&mask);

        hex=hex>>4;
        System.out.printf("%X%n",hex&mask);

        hex=hex>>4;
        System.out.printf("%X%n",hex&mask);

    }
}
