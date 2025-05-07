import java.lang.System;
import java.util.Scanner;


public class operations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=(a*b*c);
        int e=(a+b+c);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d/e);
        sc.close();
        

    }
}
