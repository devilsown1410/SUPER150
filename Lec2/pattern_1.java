package Lec2;

public class pattern_1 {
    public static void main(String[] args) {
        int n = 5;
        while (n-- > 0){
            int star = 5;
            int i = 1;
            while (i <= star) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
        }
    }
}
