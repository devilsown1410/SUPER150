package Lec10;
import java.util.*;
public class equation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=1;
        System.out.println("Enter k");
        int k=sc.nextInt();
        System.out.println("Enter N");
        int N= sc.nextInt();
        int hi=N;
        int lo=0;
        int ans=0;
        while(lo<=hi) {
            int mid = (lo + hi) / 2;
            if (Math.pow(mid, k) <= N) {
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        System.out.println(ans);
    }
}
