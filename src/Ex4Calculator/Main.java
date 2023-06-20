package Ex4Calculator;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculatorPro calculatorPro = new CalculatorPro();
        double operand1 = calculatorPro.getOperand(scanner.next());
        double operand2 = calculatorPro.getOperand(scanner.next());
        String operation = calculatorPro.getOperation(scanner.next());
        calculatorPro.calculation(operand1, operand2, operation);
        scanner.close();
    }
    
}
