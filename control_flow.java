
import java.util.Scanner;

public class control_flow {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n==== Main Menu ====");
            System.out.println("1. Check If Prime Numbers");
            System.out.println("2. Check If Amstrong Numbers");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            if (choice == 3) {
                break;
            }

            switch (choice) {

                case 1:
                    System.out.println("Enter Number to be checked for Prime");
                    int num1 = sc.nextInt();
                    int count = 0;
                    if (num1 == 1) {
                        System.out.println(num1 + " is not a prime number");
                    } else {
                        for (int i = 1; i <= num1; i++) {
                            if (num1 % i == 0) {
                                count++;
                            }
                        }
                        if (count > 2) {
                            System.out.println(num1 + " is not a Prime Number");
                        } else {
                            System.out.println(num1 + " is a Prime Number");

                        }

                    }
                    break;
                case 2:
                    System.out.println("Enter Number to be checked for Armstrong");
                    int num2 = sc.nextInt();
                    int og = num2;
                    int count2 = 0;
                    int temp = num2;
                    while (num2 != 0) {
                        num2 = num2 / 10;
                        count2++;
                    }
                    int digit;
                    int sum = 0;
                    while (temp != 0) {
                        digit = temp % 10;
                        sum += Math.pow(digit, count2);
                        temp /= 10;
                    }
                    if (sum == og) {
                        System.out.println(og + " is an Armstrong number");
                    } else {
                        System.out.println(og + " is not an Armstrong number");
                    }
                    break;
            }

        }
    }

}
