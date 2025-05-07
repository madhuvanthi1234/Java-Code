import java.util.Scanner;
public class pass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int mark1=sc.nextInt();
        int mark2=sc.nextInt();
        int mark3=sc.nextInt();
        int mark4=sc.nextInt();
        int mark5=sc.nextInt();
        int avg=(mark1+mark2+mark3+mark4+mark5)/5;
        if(avg<=35){
            System.out.println("class required");

        }
        else{
            System.out.println("good to go");
        }
        sc.close();
    }
    
}
