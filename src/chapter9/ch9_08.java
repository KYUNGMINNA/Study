package chapter9;

import java.lang.reflect.Array;
import  java.util.*;
public class ch9_08 {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5};
        int[] arrClone=arr.clone();
        arrClone[0]=6;

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrClone));
    }

}
