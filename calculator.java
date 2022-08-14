package test.calculator;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("|| WELCOME ||");

        double n1;
        double n2;
        double result;

        System.out.println("Choose an operation");
        char operator = sc.next().charAt(0);
        System.out.print("Enter 1st number: ");
        n1 = sc.nextDouble();
        System.out.print("Enter 2nd number: ");
        n2 = sc.nextDouble();

        switch (operator) {
            case '+':
                result = n1 + n2;
                System.out.printf("%.1f + %.1f = %.1f", n1, n2, result);
                break;
            case '-':
                result = n1 - n2;
                System.out.printf("%.1f - %.1f = %.1f", n1, n2, result);
                break;
            case '*':
                result = n1 * n2;
                System.out.println(n1 + " * " + n2 + " = " + result);
                break;
            case '/':
                result = n1 / n2;
                System.out.println(n1 + " / " + n2 + " = " + result);
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }

    }

}
