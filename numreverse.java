import java.util.*;
class numreverse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a num");
        int a=sc.nextInt();
        int reverse=0;
        
        while(a>=0){
            int sum=a%10;
            reverse=reverse*10+sum;
            a/=10;


        }
        System.out.println(reverse);

    }
}
