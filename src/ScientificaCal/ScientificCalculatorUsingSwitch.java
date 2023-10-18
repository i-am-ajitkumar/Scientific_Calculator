package ScientificaCal;

import java.util.Scanner;

public class ScientificCalculatorUsingSwitch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double memory = 0;
		double result = 0;
		boolean exit = false;
		boolean newCalculation = true;

		while (!exit) {
			if (newCalculation) {
				System.out.println("Scientific Calculator Menu:");
				System.out.println("1. Addition");
				System.out.println("2. Subtraction");
				System.out.println("3. Multiplication");
				System.out.println("4. Division");
				System.out.println("5. Square Root");
				System.out.println("6. Exponentiation");
				System.out.println("7. Sine");
				System.out.println("8. Cosine");
				System.out.println("9. Tangent");
				System.out.println("10. Logarithm (base 10)");
				System.out.println("11. Natural Logarithm (ln)");
				System.out.println("12. Memory Operations");
				System.out.println("13. Exit");
				System.out.print("Select an operation (1-13): ");
			} else {
				System.out.println("Result: " + result);
				System.out.print("Select an operation (1-13 or 0 for new calculation): ");
			}

			int choice = scanner.nextInt();
			double operand1;
			double operand2;

			switch (choice) {
			case 0:
				newCalculation = true;
				break;
			case 1:
				System.out.print("Enter the 1st number to add: ");
				operand1 = scanner.nextDouble();
				System.out.print("Enter the 2nd number to add: ");
				operand2=scanner.nextDouble();
				result = operand1+operand2;
				System.out.println(result);
				newCalculation = false;
				break;
			case 2:
				System.out.print("Enter the 1st number to subtract: ");
				operand1 = scanner.nextDouble();
				System.out.print("Enter the 2nd number to subtract: ");
				operand2=scanner.nextDouble();
				result = operand1-operand2;
				newCalculation = false;
				break;
			case 3:
				System.out.print("Enter the 1st number to multiply by: ");
				operand1 = scanner.nextDouble();
				System.out.print("Enter the 2nd number to multiply by: ");
				operand2=scanner.nextDouble();
				result = operand1 *operand2;
				newCalculation = false;
				break;
			case 4:
				System.out.print("Enter the number to divide by: ");
				operand1 = scanner.nextDouble();
				System.out.print("Enter the number to divide by: ");
				operand2 = scanner.nextDouble();
				if (operand2 != 0) {
					result = operand1 /operand2;
				} else {
					System.out.println("Error: Division by zero.");
				}
				newCalculation = false;
				break;
			case 5:
				System.out.print("Enter the number to find square root: ");
				operand1 = scanner.nextDouble();

				result = Math.sqrt(operand1);
				newCalculation = false;
				break;
			case 6:
				System.out.print("Enter the exponent: ");
				operand1 = scanner.nextDouble();
				System.out.print("Enter the exponent: ");
				operand2 = scanner.nextDouble();
				result = Math.pow(operand1,operand2);
				newCalculation = false;
				break;
			case 7:
				System.out.print("Enter the num: ");
				operand1 = scanner.nextDouble();
				result = Math.sin(operand1);
				newCalculation = false;
				break;
			case 8:
				System.out.print("Enter the num: ");
				operand1 = scanner.nextDouble();
				result = Math.cos(operand1);
				newCalculation = false;
				break;
			case 9:
				System.out.print("Enter the num: ");
				operand1 = scanner.nextDouble();
				result = Math.tan(operand1);
				newCalculation = false;
				break;
			case 10:
				System.out.print("Enter the num: ");
				operand1 = scanner.nextDouble();
				if (operand1 > 0) {
					result = Math.log10(operand1);
				} else {
					System.out.println("Error: Invalid input for logarithm.");
				}
				newCalculation = false;
				break;
			case 11:
				System.out.print("Enter the num: ");
				operand1 = scanner.nextDouble();
				if (operand1 > 0) {
					result = Math.log(operand1);
				} else {
					System.out.println("Error: Invalid input for natural logarithm.");
				}
				newCalculation = false;
				break;
			case 12:
				System.out.println("Memory Menu:");
				System.out.println("1. Store result in memory");
				System.out.println("2. Recall memory");
				System.out.println("3. Clear memory");
				System.out.print("Select a memory operation (1-3): ");
				int memoryChoice = scanner.nextInt();
				switch (memoryChoice) {
				case 1:
					memory = result;
					break;
				case 2:
					result = memory;
					break;
				case 3:
					memory = 0;
					break;
				default:
					System.out.println("Invalid memory operation.");
					break;
				}
				break;
			case 13:
				exit = true;
				break;
			default:
				System.out.println("Invalid choice.");
				break;
			}
		}

		System.out.println("Calculator closed.");
	}
}