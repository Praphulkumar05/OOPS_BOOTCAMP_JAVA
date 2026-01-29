class Shapes{      // this is hierarchical  inheritance with  method  overriding 
    void print(){
        System.out.println("I am in the shape");
    }

}
class Circle extends Shapes {
    void print(){
        System.out.println("I am in the circle");
    }

}
class Triangle extends Shapes{
     void print(){
        System.out.println("I am in the triangle");
    }

}
class Square extends Shapes{
     void print(){
        System.out.println("I am in the sqaure");
    }

}


public class Main{
    public static void main(String[] args) {
        Shapes s =new Circle();       // this is called upcasting i.e-> making the object of parent class but referencing the child class ..
        Circle c = new Circle();
        Triangle t = new Triangle();
        c.print();
       s.print();
    //    t.print();

       
    }
}