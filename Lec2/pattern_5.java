package Lec2;

public class pattern_5 {
    public static void main(String[] args) {
        int n=5;
        int i=1;
        while(i <=n) {
            int j=1;
            while(j<=i-1) {
                System.out.print("  ");
                j++;
            }
            int k=i;
            while(k<=n){
                System.out.print("* ");
                k++;
            }
            i++;
            System.out.println();
        }
    }
}
