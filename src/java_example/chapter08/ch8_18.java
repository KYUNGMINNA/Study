package java_example.chapter08;

public class ch8_18 {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            deleteTempFiles();
        }
    }
    static void startInstall(){}
    static  void copyFiles(){}
    static void deleteTempFiles(){}
}
