package Lec17;
import java.util.*;
public class String_1 {
    public static void main(String[] args) {
        String s="helol";
        SubString(s);
    }
    public static void SubString(String s){
        for(int i=1;i<=s.length();++i){
//            for (int j = i; j <=s.length(); j++) {
//                int len=j=i;
//                System.out.print(s.substring(len,j));
//            }
            for (int j = 0; j <= s.length()-i; j++) {

                System.out.print(s.substring(j,j+i)+"\t");
            }
            System.out.println();
        }
    }
}
