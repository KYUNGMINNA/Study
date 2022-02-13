package chapter14;

class Outer{
    int val=10;

    class Inner{
        int val=20;

        void method(int i){
            int val=30;


            MyFunction3 f=()->{
                System.out.println(" i"+i);
                System.out.println(" val"+val);
                System.out.println("this.val"+ ++ this.val);
                System.out.println("Outer.this.val"+ ++ Outer.this.val);
            };
            f.myMethod();
        }
    }
}
public class ch14_03 {
    public static void main(String[] args) {
        Outer outer=new Outer();
        Outer.Inner inner=outer.new Inner();
        inner.method(100);
    }

}
@FunctionalInterface
interface MyFunction3 {
    public abstract void myMethod();
}
