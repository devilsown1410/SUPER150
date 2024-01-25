package Lec3;
import java.util.*;
public class fibonacci {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("0");
        } else if (n == 2) {
            System.out.println("0");
            System.out.println("1" + "\t" + "1");
        } else {
            System.out.println("0");
            System.out.println("1" + "\t" + "1");
            int a = 1;
            int b = 1;
            int c = a + b;
            int i = 3;
            int star = 3;
            while (i <= n) {
                int j = 1;
                while (j <= star) {
                    System.out.print(c + "\t");
                    a = b;
                    b = c;
                    c = a + b;
                    j++;
                }
                i++;
                star++;
                System.out.println();
            }
        }
    }
}
