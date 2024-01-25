package Lec2;

public class pattern_7 {
    public static void main(String[] args) {
        int i=1;
        int n=5;
        while (i<=n) {
            if (i == 1 || i == 5) {
                int j = 0;
                while (j < n) {
                    System.out.print("* ");
                    j++;
                }
            } else {
                int j = 0;
                while (j < n) {
                    if (j == 0 || j == n - 1) {
                        System.out.print("* ");
                        j++;
                    } else {
                        System.out.print("  ");
                        j++;
                    }
                }
            }
            System.out.println();
            i++;
        }
    }
}
