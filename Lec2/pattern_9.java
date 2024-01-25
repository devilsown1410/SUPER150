package Lec2;

public class pattern_9 {
    public static void main(String[] args) {
        int i=1;
        int n=5;
        while (i<=n) {
            int j = 0;
            while (j < n - i) {
                System.out.print("  ");
                j++;
            }
            j = n - i + 1;
            while (j < n) {
                System.out.print("* ");
                j++;
            }
            j = 0;
            while (j < i) {
                System.out.print("* ");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
