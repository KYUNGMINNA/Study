package java2.chapter04;

public class ch4_30 {

    public static void main(String[] args) {
        int sum=0,i=0;

        while(true){
            if(sum>100)
                break;
            ++i;
            sum+=i;
        }

        System.out.println("i="+i);
        System.out.println("sum="+sum);
    }

}