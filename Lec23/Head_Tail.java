package Lec23;

public class Head_Tail {
    public static void main(String[] args) {
        int n=3;
        System.out.println(head(n,""));
    }
    public static int head(int n ,String ans){
        if (n==0){
            System.out.println(ans);
            return 1;
        }
        int a=0;
            if (ans.isEmpty() ||ans.charAt(ans.length() - 1)!='H') {
                a=head(n - 1, ans + 'H');
            }

        int b=head(n-1,ans+'T');
            return a+b;
    }
}
