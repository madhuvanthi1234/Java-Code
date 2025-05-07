import java.util.Scanner;
public class array1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr=new int[5];
        System.out.println("Enter 5 num");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        //print statement
        System.out.println("num1:"+arr[0]);
        System.out.println("num2:"+arr[1]);
        System.out.println("num3:"+arr[2]);
        System.out.println("num4:"+arr[3]);
        System.out.println("num5:"+arr[4]);
        sc.close();
    }
    
} 