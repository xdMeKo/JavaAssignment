package assignment;

import java.util.Scanner;

public class TriangleValidity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three angles
        System.out.print("Enter the first angle: ");
        int angle1 = scanner.nextInt();

        System.out.print("Enter the second angle: ");
        int angle2 = scanner.nextInt();

        System.out.print("Enter the third angle: ");
        int angle3 = scanner.nextInt();

        if (angle1 > 0) {
            if (angle2 > 0) {
                if (angle3 > 0) {
                    if (angle1 + angle2 + angle3 == 180) {
                        System.out.println("The angles form a valid triangle.");
                    }
                    if (angle1 + angle2 + angle3 != 180) {
                        System.out.println("The angles do not form a valid triangle.");
                    }
                }
                if (angle3 <= 0) {
                    System.out.println("The angles do not form a valid triangle.");
                }
            }
            if (angle2 <= 0) {
                System.out.println("The angles do not form a valid triangle.");
            }
        }
        if (angle1 <= 0) {
            System.out.println("The angles do not form a valid triangle.");
        }

        scanner.close();
    }
}



