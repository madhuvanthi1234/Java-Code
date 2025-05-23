class teacher{
    private String name="Madhu";
    void display(){
        System.out.println(name);
    }
}
public class accessprivat {
    public static void main(String[] args) {
        teacher t=new teacher();
        t.display();
    }
}
