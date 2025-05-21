import java.util.*;
public class func3 {
    void evenorodd(int num){
        if(num%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        func3 f=new func3();
        f.evenorodd(num);




    }

}
