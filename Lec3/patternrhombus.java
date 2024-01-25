package Lec3;

import java.util.Scanner;

public class patternrhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int k=1;
        int n = sc.nextInt();
        int star = 1;
        int space = n - 1;
        while (i <= (n*2)-1) {
            int j = 1;
            while (j <= space) {
                System.out.print("\t");
                j++;
            }
            int val = k;
            j = 1;
            while (j <= star) {
                System.out.print(val + "\t");
                if (j <= star / 2) {
                    val++;
                } else {
                    val--;
                }
                j++;
            }
            if (i>=n){
                k--;
                space++;
                star -= 2;
            }
            else{
                k++;
                space--;
                star += 2;
            }
            i++;
            System.out.println();
        }
    }
}
