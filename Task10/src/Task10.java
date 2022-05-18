import java.util.InputMismatchException;
import java.util.Scanner;

public class Task10 {
    static double SetDouble(){
        while(true) {
            try {
                Scanner sc = new Scanner(System.in);
                double n = 0;
                System.out.println("Input the number:");
                n = sc.nextDouble();
                return n;
            } catch (InputMismatchException h) {
                System.out.println("Unsupported number!");
            }
        }
    }

    public static String getOperation(String operation) throws NotSupportedOperationException {
        if((operation.equals("+"))||(operation.equals("-"))||(operation.equals("*"))||(operation.equals("/"))||
                (operation.equals("%"))) {
            return operation;
        } else {
            throw new NotSupportedOperationException();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1 = 0, n2 = 0, res = 0;
        String operation;
        System.out.println("This is a calculator. Enter integer and fractional numbers. A set of supported " +
                "operations: +, -, *, /, %.");
        n1 = SetDouble();
        while(true) {
            try {
                System.out.println("Input the operation(+, -, *, /, %):");
                operation = sc.nextLine();
                getOperation(operation);
                break;
            } catch (NotSupportedOperationException e) {
                System.out.println("Unsupported operation!");
            }
        }
        n2 = SetDouble();
        if (operation.equals("+")) {
            res = n1 + n2;
        } else if (operation.equals("-")) {
            res = n1 - n2;
        } else if (operation.equals("*")) {
            res = n1 * n2;
        } else if (operation.equals("/")) {
            if (n2 == 0) {
                System.out.println("Can't divide by 0");
                System.exit(1);
            } else {
                res = n1 / n2;
            }
        } else if (operation.equals("%")) {
            res = n1 % n2;
        }
        System.out.println("Result: " + res);
    }
}
