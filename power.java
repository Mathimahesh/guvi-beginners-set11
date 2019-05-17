import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double x=sc.nextInt();
        double y=sc.nextInt();
        double z =Math.pow(x,y);
        System.out.println(Math.round(z));
    }
}
