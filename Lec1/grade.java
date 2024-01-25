package Lec1;
import java.util.*;
public class grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Marks : ");
        int m=sc.nextInt();
        if (m>=75){
            System.out.println("A");
        } else if (m>=65){
            System.out.println("B");
        } else if (m>=55) {
            System.out.println("C");
        } else if (m>=45){
            System.out.println("D");
        } else{
            System.out.println("Fail");
        }
    }

}
