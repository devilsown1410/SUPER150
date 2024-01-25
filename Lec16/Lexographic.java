package Lec16;

import java.util.Scanner;

public class Lexographic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1="Raj";
        String s2="Rajesh";
        String s3=sc.next();
        String s4=sc.next();
        int k=compare(s3,s4);
        if(k<0){
            System.out.println(s4);
        }else{
            System.out.println(s3);
        }
    }
    public static int compare(String s1,String s2){
        for (int i = 0; i < Math.min(s1.length(),s2.length()); i++) {
            if(s1.charAt(i)!=s2.charAt(i)){
                return (int)s1.charAt(i)-(int)s2.charAt(i);
            }

        }
        return s1.length()-s2.length();

    }
}
