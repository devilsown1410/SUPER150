package Lec1;
import java.util.*;
public class loop_demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;
        while(n>=0){
            s+=n;
            n--;
        }
        System.out.println(s);
    }
}
