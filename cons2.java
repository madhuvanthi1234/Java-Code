public class cons2 {
    int marks;
    String name;
    cons2(int a,String b){
        marks=a;
        name=b;
    }
    public static void main(String[] args) {
        cons2 c=new cons2(55,"Viknesh");
        cons2 d=new cons2(27,"Madhu");
        System.out.println(" "+d.name+" "+d.marks);
        System.out.println(" "+c.name+" "+c.marks);
    }
}
