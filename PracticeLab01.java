import java.util.Scanner;

public class PracticeLab01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number");
        int num2 = scanner.nextInt();

        int start = num1 < num2 ? num1 : num2;
        int end = num1 > num2 ? num1 : num2;

        double average = (num1 + num2) / 2.0;
        System.out.println("The average of the two numbers is " + average);

        int evenSum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            }
        }
        System.out.println("The sum of all even numbers between num1 and num2 is: " + evenSum);

        int squareSum = 0;
        for (int i = start; i <= end; i++) {
            squareSum += i * i;
        }
        System.out.println("The sum of all squares between num1 and num2 is: " + squareSum);

        scanner.close();
    }
}
