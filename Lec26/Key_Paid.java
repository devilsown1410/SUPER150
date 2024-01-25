package Lec26;

public class Key_Paid {
    static String [] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args) {
        String ques="23";
        keyPad(ques,"");

    }
    public static void keyPad(String ques,String ans){
        if (ques.length()==0){
            System.out.println(ans);
            return;
        }
        char ch= ques.charAt(0);
        String press= map[ch-'0'];
        for (int i = 0; i < press.length(); i++) {
            keyPad(ques.substring(1),ans+press.charAt(i));

        }
    }
}
