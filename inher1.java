class dad{
    int money=2000;
}
class son extends dad{

}
public class inher1 {
    public static void main(String[] args) {
        son s=new son();
        System.out.println(" "+s.money);
    }
}
