package Lec2;
import java.util.*;
public class pattern_12 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            int j=n;
            while(j>i){
                System.out.print("  ");
                j--;
            }
            int k=1;
            while(k<(2*i)-1){
                if (k%2==0){
                    System.out.print("! ");
                }
                else{
                    System.out.print("* ");
                }
                k++;
            }
            i++;
            System.out.println();
        }
    }
}
