import java.util.*;
public class array3 {
    public static void main(String[] args) {
        System.out.println("Enter your marks for each sub");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<=size-1;i=i+1){
            arr[i]=sc.nextInt();
            
        }
        if(size%2!=0){
            System.out.println("mid element:"+ arr[size/2]);
        }
        else{
            System.out.println("mid element:" + arr[size/2-1] +"and "+ arr[size/2]);
        }sc.close();
    }
    
}
