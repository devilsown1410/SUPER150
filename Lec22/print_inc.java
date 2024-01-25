package Lec22;

public class print_inc {
    public static void main(String[] args) {
        int n=10;
        inc(n);

    }
    public static void inc(int n){
        if (n==0){
            return;
        }

        inc(n-1);
        System.out.print(n);

    }

}
