package Lec4;
import java.util.*;
public class gcd {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int  x=sc.nextInt();
        int y=sc.nextInt();
        int gcd=1;
        for(int i=2;i<=Math.min(x,y);++i){
            if (x%i==0 && y%i==0){
                gcd=i;
            }
        }
        System.out.println(gcd);
    }
}
