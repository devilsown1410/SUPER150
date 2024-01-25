package Lec4;

import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int  x=sc.nextInt();
        int y=sc.nextInt();
        int lcm=1;
        for(int i=Math.max(x,y);i<=x*y;++i){
            if (i%x==0 && (i%y)==0){
                lcm=i;
                break;
            }
        }
        System.out.println(lcm);
    }
}
