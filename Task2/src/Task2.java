import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1 = 0, n2 = 0, res = 0;
        char operation = 0;
        System.out.println("Input the first number:");
        n1 = sc.nextDouble();
        System.out.println("Input the operation(+, -, *, /, %):");
        operation = sc.next().charAt(0);
        System.out.println("Input the second number:");
        n2 = sc.nextDouble();
        if (operation == '+') {
            res = n1 + n2;
        } else if (operation == '-') {
            res = n1 - n2;
        } else if (operation == '*') {
            res = n1 * n2;
        } else if (operation == '/') {
            if (n2 == 0) {
                System.out.println("Can't divide by 0");
                System.exit(1);
            } else {
                res = n1 / n2;
            }
        } else if (operation == '%') {
            res = n1 % n2;
        } else {
            System.out.println("Error. Unidentified operation.");
            System.exit(1);
        }
        System.out.println("Result: " + res);
    }
}
