package Lec2;

public class pattern_3 {
    public static void main(String[] args) {
        int i=1;
        int n=5;
        while(i<=n){
            int k=i;
            while(k<=n){
                System.out.print("* ");
                k++;
            }
            System.out.println();
            i++;
        }
    }
}
