package Lec1;
import java.util.*;
public class reversenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;
        while(n!=0){
            s=s*10+(n%10);
            n/=10;
        }
        System.out.println(s);
    }
}
