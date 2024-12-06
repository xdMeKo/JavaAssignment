package assignment;
import java.util.Scanner;

public class simplecalculator {
	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	      
	        System.out.print("Enter the first number: ");
	        double num1 = scanner.nextDouble();

	        System.out.print("Enter the second number: ");
	        double num2 = scanner.nextDouble();

	       
	        System.out.print("Enter an operator (+, -, *, /): ");
	        char operator = scanner.next().charAt(0);

	        
	        if (operator == '+') {
	            System.out.println("Result: " + (num1 + num2));
	        }
	        if (operator == '-') {
	            System.out.println("Result: " + (num1 - num2));
	        }
	        if (operator == '*') {
	            System.out.println("Result: " + (num1 * num2));
	        }
	        if (operator == '/') {
	            if (num2 != 0) { 
	                System.out.println("Result: " + (num1 / num2));
	            } else {
	                System.out.println("Error: Division by zero is not allowed.");
	            }
	        }

	        
	        if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
	            System.out.println("Error: Invalid operator.");
	        }

	        scanner.close();
	    }
	}


