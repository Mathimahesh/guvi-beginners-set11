import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String s1 = Integer.toString(a);
        String s2 = Integer.toString(b);
        System.out.println(s1.concat(s2));
    }
}
