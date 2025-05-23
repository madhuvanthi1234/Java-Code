class student{
    int mark=0;
    static String teacher="Madhu";
}
public class stat {
    public static void main(String[] args) {
        student s1=new student();
        s1.mark=33;
        student s2=new student();
        s2.mark=44;
        s2.teacher="Mitula";
        System.out.println(s2.teacher);
        System.out.println(s1.teacher);

    }
    
}
