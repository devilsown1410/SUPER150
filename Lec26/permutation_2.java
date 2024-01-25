package Lec26;

public class permutation_2 {
    public static void main(String[] args) {
        print("123","");

    }
    public static void print(String ques,String s){
        if (ques.length()==0){
            System.out.println(s);
            return;
        }
        for (int i = 0; i < ques.length(); i++) {
            char ch=ques.charAt(i);
            boolean val=false;
            for (int j = i+1; j < ques.length(); j++) {
                if (ques.charAt(j)==ch){
                    val=true;
                    break;
                }

            } if (val==false) {
                print(ques.substring(0, i) + ques.substring(i + 1), s + ques.charAt(i));
            }

        }
    }
}
