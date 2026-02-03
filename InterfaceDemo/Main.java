interface Brake {
    void brake();
}
interface Engine {
    void start();

    void stop();

    void acc();
}
class Car implements Brake, Engine {
    public void brake() {
        System.out.println("I break like a car");

    }

    public void start() {
        System.out.println("I start like a car");

    }

    public void stop() {
        System.out.println("I stop like a car");

    }

    public void acc() {
        System.out.println("I acc like a car");

    }

}

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.acc();
        c.brake();
        c.start();
        c.stop(); 
       
       
    }
}
