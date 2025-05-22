class a{
    int one=1;
}
class b extends a{
    int two=2;
}
class c extends b{
    int three=3;
}
public class mulinher {
    public static void main(String[] args) {
        c t=new c();
        System.out.println(" "+t.three);
    }
}
