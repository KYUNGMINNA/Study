package java_example.chapter06;

public class ch6_22 {
    public static void main(String[] args) {

        String[] arr={"100","200","300"};

        System.out.println(concatenate("","100","200","300"));
        System.out.println(concatenate("-",arr));
        System.out.println(concatenate(",",new String[]{"1","2","3"}));
        System.out.println("["+concatenate(",",new String[0])+"]");
        System.out.println("["+concatenate(",")+"]");




    }
    static String concatenate(String delim,String...args){
        String result="";

        for (String str :args){
            result+=str+delim;
        }
        return result;
    }
}
