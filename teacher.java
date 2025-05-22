public class teacher {
    String name;
    teacher(){
        System.out.println(" hello ");
    }
    void display(String name){
        this.name=name;
    }
    public static void main(String[] args) {
        teacher obj=new teacher();
        obj.display("Madhu");
        System.out.println(obj.name);
    }
}
