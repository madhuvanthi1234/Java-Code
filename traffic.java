import java.util.Scanner;
public class traffic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String clr=sc.nextLine(); 
        if(clr.equals("red")){
            System.out.println("stop");

        }
        else if(clr.equals("yellow")){
            System.out.println("ready");
        }
        else if(clr.equals("green")){
            System.out.println("go");
        }
        sc.close();
    }
    
}
