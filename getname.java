import java.lang.System;
import java.util.Scanner;

public class getname {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int age=sc.nextInt();
        sc.nextLine();
        String add=sc.nextLine();
        System.out.println(name);
        System.out.println(age);
        System.out.println(add);
        sc.close();

    }
}
