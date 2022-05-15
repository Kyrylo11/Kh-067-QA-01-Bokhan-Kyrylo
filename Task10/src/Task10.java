import java.util.InputMismatchException;
import java.util.Scanner;

public class Task10 {
    static String NotSupportedOperationException() throws Exception{
        Scanner sc = new Scanner(System.in);
        String operation;
        System.out.println("Input the operation(+, -, *, /, %):");
        operation = sc.nextLine();
        if((operation.equals("+"))||(operation.equals("-"))||(operation.equals("*"))||(operation.equals("/"))||
                (operation.equals("%")))
        {
            return operation;
        }
        else{
            throw new Exception("Unsupported operation!");
        }
    }

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

    public static void main(String[] args) {
        double n1 = 0, n2 = 0, res = 0;
        String operation;
        System.out.println("This is a calculator. Enter integer and fractional numbers. A set of supported " +
                "operations: +, -, *, /, %.");
        n1 = SetDouble();
        while(true) {
            try {
                operation = NotSupportedOperationException();
                break;
            } catch (Exception e) {
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
