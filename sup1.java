class person{
    String name;
    person(String name){
        this.name=name;
    }
}
class employee extends person{
    int empid=101;
    employee(){
        super("john");
    }
    void display(){
        System.out.println(name);
        System.out.println(empid);
    }

}
public class sup1 {
    public static void main(String[] args) {
        employee e=new employee();
        e.display();
    }
}
