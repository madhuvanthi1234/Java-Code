public class func2 {
    void sum(int num1,int num2){
        int sum=num1+num2;
        System.out.println("the sum is "+sum);
    }
    void sub(int num1,int num2){
        int sub=num1-num2;
        System.out.println("the sub is "+sub);
    }
    void mul(int num1,int num2){
        int mul=num1*num2;
        System.out.println("the mul is "+mul);
    }
    void div(int num1,int num2){
        int div=num1/num2;
        System.out.println("the div is "+div);
    }
    public static void main(String[] args) {
        func2 f=new func2();
        f.sum(2,5);
        f.sub(5,2);
        f.mul(2,3);
        f.div(4,2);
    }
}
