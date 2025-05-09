import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String name = getName();
        System.out.printf("Welcome: %s", name);
    }

    public static String getName() {
        Scanner scanner =  new Scanner(System.in);
        String inputName = scanner.nextLine();
        scanner.close();
        return inputName;
    }
}