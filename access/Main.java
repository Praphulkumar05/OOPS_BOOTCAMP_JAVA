class A{
    protected int num;
    String name;
    int arr[];
    public int getNum(){
        return num;
    }
    public void setNum(int num){
        this.num = num;
    }
    public A(int num ,String name){
        this.num=num;
        this.name=name;
        this.arr=new int [num];
    }
}
 class B extends A{
    public B(int num, String name){
        super(num,name);

    }

}

public class Main{
    public static void main(String[] args) {
        B b = new B(100, "XYZ");
        int  p = b.num;
      

       
    } 
}