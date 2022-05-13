import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(String.format("Where are you live, %s?", name));
        String address = sc.nextLine();
        System.out.println(String.format("%s live now in %s", name, address));
    }
}