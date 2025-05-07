import java.lang.System;
import java.util.Scanner; 

public class database {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        double mark=sc.nextDouble();
        sc.nextLine();
        String dep=sc.nextLine();
        System.out.println("My name is " +name);
        System.out.println("My score is " +mark/10+"/10");
        System.out.println("My department is "+dep);
        sc.close();

    }
    
}
