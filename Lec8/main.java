package Lec8;
import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        while(n-->0){
            int arr[]=new int[3];
            int k=0;
            for(int i=0;i<3;++i){
                arr[i]=sc.nextInt();
                if (arr[i]==1){
                    k++;
                }
            }
            if (k>=2){
                c++;
            }
        }
        System.out.println(c);
    }
}
