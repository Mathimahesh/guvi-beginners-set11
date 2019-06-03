import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String words[] = str.split("\\s");
        String cap = "";
        for(String w:words){
            String first = w.substring(0,1);
            String rem = w.substring(1);
            cap += first.toUpperCase()+rem+" ";
        }
        System.out.println(cap);
    }
}
