import java.lang.reflect.Member;

class Student{

    int roll;
    String name;
    Student(int roll, String name){
        this.roll=roll;
        this.name=name;
    }
    // public void name(){
    //     System.out.println("My name is: "+name);
    // }
    // public void roll(){
    //     System.out.println("My roll is:"+roll);
    // }

    Student(){
        roll=12212240;
        name="Praphul";
    }
    public void name(){
        System.out.println("My name is: "+name);
    }
    public void roll(){
        System.out.println("My roll is:"+roll);
    }

}
class  Area{
   

    public double calculateArea(int  length,int breadth){
        return length*breadth;
    }
    public double calculateArea(int r){
        return 3.7*r*r;

    }
    public double calculateArea(double height,double base){
        return 0.5*base*height;
    }
}
class Employee {
    int EmpId;
    String name;
    String designation;
    double salary;
    Employee(int EmpId,String name, String designation,double salary){
        this.EmpId=EmpId;
        this.name=name;
        this.designation=designation;
        this.salary=salary;
    }
    public void getInfo(int EmpId){
        System.out.println("The EmpId is this:"+EmpId);


    }
    public void getInfo(String name,String designation){
        System.out.println("This is the name:"+name);
        System.out.println("This is the designation: "+designation);
    }
    public void  getInfo(double salary){
        System.out.println("This is the salary :"+salary);
    }
    
}
class Animal{
    public void AboutVoice(){
        System.out.println("All animal have voice");
    }
}
class Dog extends Animal{
    public void AboutVoice(){
        super.AboutVoice();
        System.out.println("Dog barks");
    }
}
class Cat extends Dog{
    public void AboutVoice(){
        super.AboutVoice();
        System.out.println("Cat me..aoo");
    }
}






public class NumberOne {
    public static void main(String[] args) {
     
       
       
        
        
        
    }
    
}
