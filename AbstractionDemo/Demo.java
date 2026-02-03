abstract class Parent {  //can not create the objrct of the absract class and also can not create the absract const.
    int age;
   public   Parent(int age){
    this.age=age;

    }
    abstract void carrer();
    abstract void hero();

}

class Son extends Parent {
    public Son(int age){
        super(age);
        this.age=age;
    }
    void carrer() {
        System.out.println("I want to be an coder");
    }

    void hero() {
        System.out.println("My Fav hero is Iron Man");
    }
}

class Daughter extends Parent {
    public Daughter(int age){
        super(age);
        this.age=age;
    }
    void carrer() {
        System.out.println("I want to be an doctor");
    }

    void hero() {
        System.out.println("My Fav hero is Hulk");
    }

}

public class Demo {
    public static void main(String[] args) {
        Son s = new Son(12);
        s.carrer();
        s.hero();
        System.out.println(s.age);
        Daughter d = new Daughter(21);
        d.carrer();
        d.hero();
        System.out.println(d.age);

    }
}