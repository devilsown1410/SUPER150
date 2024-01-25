package Lec5;

import java.util.HashMap;
import java.util.Scanner;

public class frequency_in_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashMap<Character,Integer> hp=new HashMap<Character, Integer>();
        char[] arr=s.toCharArray();
        for (char i:arr) {
            if (hp.containsKey(i)){
                hp.put(i,hp.get(i)+1);
            }
            else{
                hp.put(i,1);
            }
        }
        for (char i: hp.keySet()
             ) {
            System.out.println(i+" : "+hp.get(i));
        }
    }

}
