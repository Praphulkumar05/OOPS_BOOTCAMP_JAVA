interface  Parent {
    static void greeting() {
        System.out.println("Hey i am in static method");
    }
}

interface Son {
    static void greeting(){
        System.out.println("Hello");
    }
    // void greeting();

}

class Main implements Parent ,Son {
    static void greeting() {
        System.out.println("HII");

    }
}

public class A {
    public static void main(String[] args) {
        Main obj = new Main();
    //     Parent.greeting();
    //    Son.greeting();
    //    Main.greeting();
       obj.greeting();

    }

}
