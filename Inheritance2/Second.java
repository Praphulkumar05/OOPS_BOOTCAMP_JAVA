class Found{
    void got(){
        System.out.println("I got it");
    }
}
class Finidd{
    void got(){
        System.out.println("I got it");
    }
    
}
class Findyy extends Found , Findd{    // As this will not work and make ambiguity ie. diamond probl. java does not support multiple inheritance..
    void got(){
        System.out.println("I got it");
    }
}

public class Second {
    public static void main(String[] args) {
        Findyy f = new Findyy();
        f.got();
        
    }
    
}
