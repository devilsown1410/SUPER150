package Lec3;

import java.util.Scanner;

public class pattern_17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=1;
        int n=sc.nextInt();
        int space=1;
        int star=n/2;
        int k=1;
        while (i<=n) {
            int j = 1;
            while (j <= star) {
                System.out.print("* ");
                j++;
            }
            j = 1;
            while (j <= space) {
                System.out.print("  ");
                j++;
            }
            j = 1;
            while (j <= star) {
                System.out.print("* ");
                j++;
            }
            k++;
            if (i<=n/2){
                star--;
                space+=2;
            } else{
                star++;
                space-=2;
            }
            i++;
            System.out.println();
        }
    }
}
