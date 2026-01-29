import java.util.*;
class Box {
     double l;   
     double h;
     double w;

    Box() {
        this.l = l;
        this.h = h;
        this.w = w;
    }
    int height = 10;


    
}
class BoxWeight extends Box {
    double weight;

    BoxWeight(double l, double h, double w, double weight) {
        // super();   super keyword is used to call the parent construtor...
        this.weight = weight;   // here  if we want to use the weight only like i made the extra const down we need to make the remaining  ele from the parent class private .
    }
    BoxWeight(int weight){
        this.weight =weight;
    }
    void print (){
        System.out.println("Height would be: "+super.height);
    }
}

public class Main {

    public static void main(String[] args) {
        // BoxWeight b1 = new BoxWeight(10, 20, 30, 40);
        // System.out.println(b1.weight);
        // BoxWeight b2 = new BoxWeight(200);    //java is based on reference type not the object type.   
        // System.out.println(b2.weight);       
        // BoxWeight b2 = new BoxWeight(100);
        // System.out.println(b2.weight);

        BoxWeight b3 = new BoxWeight(100);
      b3.print();

    }

}