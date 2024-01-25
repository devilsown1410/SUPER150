package Lec2;

public class pattern_6 {
    public static void main(String[] args) {
        int i=1;
        int n=5;
        int nsp=0;
        while(i<=n){
            int j=n-i+1;
            int k=0;
            while(k<nsp){
                System.out.print("  ");
                k++;
            }

            while(j>0){
                System.out.print("* ");
                j--;
            }
            i++;
            System.out.println();
            nsp+=2;
        }
    }
}
