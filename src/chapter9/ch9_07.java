package chapter9;

public class ch9_07 {

    public static void main(String[] args) {

        Point ori=new Point(3,5);
        Point copy=(Point) ori.clone();
        System.out.println(ori);
        System.out.println(copy);

    }
}
class Point implements Cloneable{
    int x,y;

    Point(int x,int y){
        this.x=x;
        this.y=y;

    }
    public String toString(){
        return "x:"+x+"y:"+y;
    }
    public Object clone(){
        Object obj=null;
        try {
            obj=super.clone();
        }catch (CloneNotSupportedException e){

        }
        return obj;
    }
}