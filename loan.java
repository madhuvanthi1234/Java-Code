import java.lang.System;
import java.util.Scanner;
public class loan {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your Salary");
    int salary=sc.nextInt();
    System.out.println("Enter your age");
    int age=sc.nextInt();
    if(salary>=20000 && age<=50){
        System.out.println("Enter the required loan amount");
        int amt=sc.nextInt();
        if(amt<=50000){
            System.out.println("you are eligible for loan");
        }
        else{
            System.out.println("Maximun loan amount 50000");
        }

        

    }
    else{
        System.out.println("Not eligible for loan");
    }
    sc.close();
    }
    
}
