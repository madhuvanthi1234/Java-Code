abstract class vehicle{
    abstract void speed();
    void brand(){
        System.out.println("BMW");
    }
}
class bike extends vehicle{
    void speed(){
        System.out.println("20km/hr");

    }
}
class car extends vehicle{
    void speed(){
        System.out.println("50km/hr");
    }
}
public class abstra {
    public static void main(String[] args) {
        bike b=new bike();
        b.brand();
        b.speed();
        car c=new car();
        c.speed();
    }
}
