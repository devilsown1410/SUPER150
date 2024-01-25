package Lec16;

public class pallindrome {
    public static void main(String[] args) {
        String s1="hannaha";
        System.out.println(pall(s1));
    }
    public static boolean pall(String s){
        if(s.length()%2!=0){
            return false;
        }
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
