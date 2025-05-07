import java.util.Scanner;
public class find {
    void evenorodd(int num){
        if(num%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }

    }
    public static void main(String[] args){
        System.out.println("enter a number:");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        find f=new find();
        f.evenorodd(number);
        

    }
}
