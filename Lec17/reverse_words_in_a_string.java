package Lec17;

import java.util.Scanner;

public class reverse_words_in_a_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] str = s.trim().split("\s+");

        String out = "";

        for (int i = str.length - 1; i > 0; i--) {
            out += str[i] + " ";
        }

        System.out.println(out + str[0]);
    }
}
