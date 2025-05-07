import java.util.Scanner;
public class forloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter var1");
        int num1=sc.nextInt();
        System.out.println("Enter var2");
        int num2=sc.nextInt();
        for(int i=num1;i<=num2;i=i+1){
        System.out.println(i);}
        sc.close();
    }
    
}
