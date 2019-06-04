import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int count = 0;
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0){
               count++;
            }
            if(count==x){
                System.out.println(a[i]);
                break;
            } 
            
        }
    }
}
