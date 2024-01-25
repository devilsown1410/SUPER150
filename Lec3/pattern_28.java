package Lec3;

import java.util.Scanner;

public class pattern_28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=1;
        int n=sc.nextInt();
        int star=1;
        int space=n-1;
        int val=1;
        while(i<=n){
            int j=1;
            while(j<=space){
                System.out.print("\t");
                j++;
            }
            j=1;
            int z=val;
            while(j<=star){
                System.out.print(z+"\t");
                if (j<=star/2){
                    z++;
                } else{
                    z--;
                }
                j++;
            }
            i++;
            val++;
            space--;
            star+=2;
            System.out.println();
        }
    }
}
