package java_example.chapter09;

import java.util.Scanner;
import java.io.File;

public class ch9_36 {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(new File("C:\\Users\\kyungmin\\Desktop\\data2.txt"));
        //메모장에 300 줄 넘기기 5번

        int sum=0;
        int cnt=0;

        while(sc.hasNextInt()){
            sum+=sc.nextInt();
            cnt++;
        }
        System.out.println("sum : "+sum);
        System.out.println("average :"+(double)sum/cnt);


    }
}
