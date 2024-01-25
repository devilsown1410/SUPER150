package Lec2;

public class pattern_10 {
    public static void main(String[] args) {
        int i=1;int n=5;
        while (i<=n){
            int j=i-1;
            while(j>0){
                System.out.print("  ");
                j--;
            }
            j=n-i+1;
            while(j>0){
                System.out.print("* ");
                j--;
            }
            j=n-i;
            while (j>=1){
                System.out.print("* ");
                j--;
            }
            i++;
            System.out.println();
        }
    }
}
