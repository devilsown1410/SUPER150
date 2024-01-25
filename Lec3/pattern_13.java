package Lec3;
import java.util.*;
public class pattern_13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=1;
        int n=sc.nextInt();
        int star=1;
        int k=1;
        while(i<=(2*n)-1){
            int j=1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            k++;
            if(k>n){
                star--;
            } else{
                star++;
            }
            i++;
            System.out.println();
        }
    }
}
