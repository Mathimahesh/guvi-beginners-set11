import java.util.*;
public class MyClass {
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     String s = sc.next();
     int n = sc.nextInt();
     String k = "";
     for(int i=s.length()-1;i>=0;i--){
         k+=s.charAt(i);
     }
     System.out.println(k.substring(0,n));
    }
}
