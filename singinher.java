class animal{
    void eat(){
        System.out.println(" eating");
    }
}
class dog extends animal{
    void sound(){
        System.out.println(" bark");
    }
}
public class singinher {
    public static void main(String[] args) {
        dog d=new dog();
        d.eat();
        d.sound();
    }
    
}
