import java.util.Random;
public class whileloop {
    public static void main(String[] args) {
        Random rand=new Random();
        int num=0;
        while(num!=5){
            num=rand.nextInt(10);
            System.out.println(num);
        }
    }
    
}
