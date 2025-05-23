class animal{
     animal(String name){
        System.out.println(name);
    }
    void eat(){
        System.out.println("eating");
    }
    int age=10;
}
class dog extends animal{
     dog(){
        super("puppy");
        super.eat();
        System.out.println(super.age);
        System.out.println("sleeping");
    }
}
public class sup {
    public static void main(String[] args) {
        dog d=new dog();

    }
}
