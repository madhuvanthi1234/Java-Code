public class garden {
    int apple_price=20;
    int apple_count=5;
    void total_money(){
        System.out.println("total amount is  "+(apple_price*apple_count));
    }
    public static void main(String[] args) {
        garden g=new garden();
        g.total_money();
    }
    
}
