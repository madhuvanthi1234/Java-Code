class animal{
    String name;
    int age;
    void makesound(){
        System.out.println(" animal make sound");
    }
}
class dog extends animal{
    String breed;
    @Override
    void makesound(){
        System.out.println("barks");
    }
    void fetch(){
        System.out.println("fetching");
    }

}
class cat extends animal{
    String colour;
    @Override
    void makesound(){
        System.out.println("meows");
    }
    void climb(){
        System.out.println("climbing");
    }
}
public class zoo {
    public static void main(String[] args) {
        dog d=new dog();
        d.name="tiger";
        d.age=2;
        d.breed="retriver";
        d.makesound();
        d.fetch();
        cat c=new cat();
        c.name="meena";
        c.age=2;
        c.colour="grey";
        c.makesound();
        c.climb();
    }
}
