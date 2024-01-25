package Lec3;

    import java.util.Scanner;

    public class seo {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            int oddSum = 0;
            int evenSum = 0;
            int digit=1;
            while (number != 0) {
                if (digit % 2 == 0) {
                    evenSum += number%10;
                } else {
                    oddSum += number%10;
                }
                number /= 10;
                digit++;
            }

            System.out.println("Sum of odd digits: " + oddSum);
            System.out.println("Sum of even digits: " + evenSum);
        }
    }
