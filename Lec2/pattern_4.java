package Lec2;

public class pattern_4 {
    public static void main(String[] args) {
        int n=5;
        int i=1;
        while(i<=n){
            int k=n-i;
            int j=1;
            while(j<=k){
                System.out.print("  ");
                j++;
            }
            while(k<n){
                System.out.print("* ");
                k++;
            }
            System.out.println();
            i++;
        }
    }
}
