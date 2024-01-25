package Lec3;

import java.util.Scanner;

public class pattern_27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=1;
        int n=sc.nextInt();
        int star=1;
        int space=n-1;
        while(i<=n){
            int j=1;
            while(j<=space){
                System.out.print("\t");
                j++;
            }
            int val=1;
            j=1;
            while(j<=star){
                System.out.print(val+"\t");
                if (j<=star/2){
                    val++;
                } else{
                    val--;
                }
                j++;
            }
            i++;
            space--;
            star+=2;
            System.out.println();
        }
    }
}
