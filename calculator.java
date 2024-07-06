import java.util.*;
public class calculator {
    public static void main(String[] args)
    {
        double num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first  number:");
        num1 = sc.nextDouble();
        System.out.println("Enter second  number:");
        num2 = sc.nextDouble();
        System.out.println("Enter the operator (+,-,*,/):");
        char op = sc.next().charAt(0);
        double s = 0;
        switch (op) {
        case '+':
            s = num1 + num2;
            break;
        case '-':
            s = num1 - num2;
            break;
        case '*':
            s = num1 * num2;
            break;
        case '/':
            s = num1 / num2;
            break;
 
        default:
            System.out.println("enter a valid input");
        }
        System.out.println("The final result:");
        System.out.println();
        System.out.println(num1 + " " + op + " " + num2 + " = " + s);
    }
}