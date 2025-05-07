import java.util.Scanner;
public class ternaryoperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num1");
        int num1=sc.nextInt();
        System.out.println("enter num2");
        int num2=sc.nextInt();
        boolean great=num1>num2;
        String result=great?"num1 is greater":"num2 is greater";
        System.out.println(result);
        sc.close();



    }
    
    
}
