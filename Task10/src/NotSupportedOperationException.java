import java.util.Scanner;

public class NotSupportedOperationException extends Exception{
    public static String NotSupportedOperationException() throws Exception{
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
}
