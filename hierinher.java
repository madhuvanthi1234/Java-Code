class animal{
    void eat(){
        System.out.println(" eat");
    }
}
class dog extends animal{
    void sound(){
        System.out.println("bark");
    }
}
class cat extends animal{
    void meow(){
        System.out.println("meows");
    }
}
public class hierinher {
    public static void main(String[] args) {
        dog d=new dog();
        d.eat();
        d.sound();
        cat c=new cat();
        c.eat();
        c.meow();
    }
}
