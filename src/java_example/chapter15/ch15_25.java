package java_example.chapter15;

import java.io.*;

public class ch15_25 {
    public static void main(String[] args){
        try{
            RandomAccessFile raf=new RandomAccessFile("test.dat","rw");
            System.out.println("파일 포인터 위치 :"+raf.getFilePointer());
            raf.writeInt(100);
            System.out.println("파일 포언터 위치 :"+raf.getFilePointer());
            raf.writeLong(100L);
            System.out.println("파일 포언터 위치 :"+raf.getFilePointer());

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
