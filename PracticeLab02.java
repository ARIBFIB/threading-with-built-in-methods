import java.util.Scanner;

public class PracticeLab02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1 Employee of Permanant");
        System.out.println("Press 2 Employee of Daily Wages");
        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();

        System.out.print("Hours worked: ");
        int hoursWorked = scanner.nextInt();

        switch (choice) {
            case 1:
                int salaryPermanent = 800 * hoursWorked;
                System.out.println("Enter Salary Permanent Employee: " + salaryPermanent);
                break;
            case 2:
                int salaryDailyWages = 400 * hoursWorked;
                System.out.println("Enter Salary Daily Wages Employee: " + salaryDailyWages);
                break;
            default:
                System.out.println("error.");
                break;
        }

        scanner.close();
    }
}
