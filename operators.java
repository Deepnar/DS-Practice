
import java.util.Scanner;

public class operators {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Operations Program!");
        System.out.println("This program performs various operations (arithmetic, logical, relational, shift, etc.) on two numbers.");
        System.out.println("Please enter two numbers to continue.\n");

        System.out.print("Enter 1st Number(x): ");
        int x = sc.nextInt();

        System.out.print("Enter 2nd Number(y): ");
        int y = sc.nextInt();

        while (true) {
            System.out.println("\n==== Main Menu ====");
            System.out.println("1. Arithmetic Operations");
            System.out.println("2. Relational Operations");
            System.out.println("3. Logical Operations");
            System.out.println("4. Shift Operations");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    while (true) {
                        System.out.println("\n--- Arithmetic Menu ---");
                        System.out.println("1. Add");
                        System.out.println("2. Subtract");
                        System.out.println("3. Multiply");
                        System.out.println("4. Divide");
                        System.out.println("5. Modulus");
                        System.out.println("6. Back to Main Menu");
                        System.out.print("Enter your choice: ");
                        int arithChoice = sc.nextInt();

                        if (arithChoice == 6) {
                            break;
                        }

                        switch (arithChoice) {
                            case 1:
                                System.out.println("Addition of " + x + " and " + y + " is: " + (x + y));
                                break;
                            case 2:
                                System.out.println("Subtraction of " + x + " and " + y + " is: " + (x - y));
                                break;
                            case 3:
                                System.out.println("Multiplication of " + x + " and " + y + " is: " + (x * y));
                                break;
                            case 4:
                                if (y != 0) {
                                    System.out.println("Division of " + x + " by " + y + " is: " + (x / y));
                                } else {
                                    System.out.println("Error: Division by zero is not allowed.");
                                }
                                break;
                            case 5:
                                if (y != 0) {
                                    System.out.println("Modulus of " + x + " and " + y + " is: " + (x % y));
                                } else {
                                    System.out.println("Error: Modulus by zero is not allowed.");
                                }
                                break;
                            default:
                                System.out.println("Invalid arithmetic choice.");
                                break;
                        }
                    }
                    break;

                case 2:
                    while (true) {
                        System.out.println("\n--- Relational Menu ---");
                        System.out.println("1. Check which number is greater");
                        System.out.println("2. Find greatest among three numbers");
                        System.out.println("3. Back to Main Menu");
                        System.out.print("Enter your choice: ");
                        int relChoice = sc.nextInt();

                        if (relChoice == 3) {
                            break;
                        }

                        switch (relChoice) {
                            case 1:
                                if (x > y) {
                                    System.out.println(x + " is greater than " + y);
                                } else if (x < y) {
                                    System.out.println(y + " is greater than " + x);
                                } else {
                                    System.out.println(x + " and " + y + " are equal.");
                                }
                                break;
                            case 2:
                                System.out.print("Enter 3rd Number: ");
                                int a = sc.nextInt();
                                if (x >= y && x >= a) {
                                    System.out.println(x + " is the greatest number.");
                                } else if (y >= x && y >= a) {
                                    System.out.println(y + " is the greatest number.");
                                } else {
                                    System.out.println(a + " is the greatest number.");
                                }
                                break;
                            default:
                                System.out.println("Invalid relational choice.");
                                break;
                        }
                    }
                    break;

                case 3:
                    while (true) {
                        System.out.println("\n--- Logical Menu ---");
                        System.out.println("1. Logical OR check (x > y || y > 0)");
                        System.out.println("2. Logical NOT check (!(x > y))");
                        System.out.println("3. Bitwise AND of x and y");
                        System.out.println("4. Back to Main Menu");
                        System.out.print("Enter your choice (x= " + x + " y= " + y + "):");
                        int logChoice = sc.nextInt();

                        if (logChoice == 4) {
                            break;
                        }

                        switch (logChoice) {
                            case 1:
                                boolean orResult = (x > y) || (y > 0);
                                System.out.println("Result of logical OR (x > y || y > 0): " + orResult);
                                break;
                            case 2:
                                boolean notResult = !(x > y);
                                System.out.println("Result of logical NOT (!(x > y)): " + notResult);
                                break;
                            case 3:
                                System.out.println("Bitwise AND of " + x + " and " + y + " is: " + (x & y));
                                break;
                            default:
                                System.out.println("Invalid logical choice.");
                                break;
                        }
                    }
                    break;

                case 4:
                    while (true) {
                        System.out.println("\n--- Shift Menu ---");
                        System.out.println("1. Left Shift x by 2 bits");
                        System.out.println("2. Right Shift x by 2 bits");
                        System.out.println("3. Back to Main Menu");
                        System.out.print("Enter your choice: ");
                        int shiftChoice = sc.nextInt();

                        if (shiftChoice == 3) {
                            break;
                        }

                        switch (shiftChoice) {
                            case 1:
                                System.out.println("Left shift of " + x + " by 2 bits is: " + (x << 2));
                                break;
                            case 2:
                                System.out.println("Right shift of " + x + " by 2 bits is: " + (x >> 2));
                                break;
                            default:
                                System.out.println("Invalid shift choice.");
                                break;
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid main menu choice. Please try again.");
                    break;
            }
        }

    }
}
