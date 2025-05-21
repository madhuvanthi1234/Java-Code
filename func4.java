import java.util.*;
public class func4 {
    void passorfail(int num){
        if(num>=35){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        func4 f=new func4();
        f.passorfail(num);

    }
}
