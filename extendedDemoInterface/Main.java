class Parent{
    static void say(){
        System.out.println("Parent are speaking");
    }
}
class Son extends Parent{ 
    static void say(){
        System.out.println("Child is speakiing");
    }  
}

public class Main {
    public static void main(String[] args) {
        Son s = new Son();
        Parent p = new Parent();
      p.say();  
       
    }
    
}
