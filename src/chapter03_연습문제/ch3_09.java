package chapter03_연습문제;

public class ch3_09 {
    public static void main(String[] args) {
        char ch = 'z';
        //boolean b = (ch>64);
        boolean b2 = ('a'<=ch&&ch<='z')||('A'<=ch&&ch<='Z')||('0'<=ch&&ch<='9') ;

        System.out.println(b2);

    }
}
