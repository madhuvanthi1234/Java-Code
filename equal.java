import java.lang.System;
import java.util.Scanner;

public class equal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();

         if(num1==num2){
            System.out.println("numbers are equal");

        }
        else{
            System.out.println("numbers are not equal");
        }
        sc.close();
    }
    
}
