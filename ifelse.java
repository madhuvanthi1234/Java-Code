import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String megna=sc.nextLine();
        if(megna.equals("dead")){
            System.out.println("surya meets ramya");
        }else{
            System.out.println("surya weds megna");
        }
        sc.close();

        
    }
    
}
