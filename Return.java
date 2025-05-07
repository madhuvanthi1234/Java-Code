public class Return {
    int sum(int a,int b){
        int c=a+b; 
        return c;
    }
    public static void main(String[] args){
        Return r=new Return();
        int sum=r.sum(10,27);
        System.out.println(sum);
       
    }
    
}
