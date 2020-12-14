import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.nextInt() == 1) {
            System.out.println("1.New book");
            System.out.println("2.Input index and Edit");
            System.out.println("3.Book max amount");
            System.out.println("4.Total book amount");
            System.out.println("0.Exit");
            int option = scanner.nextInt();

        }

    }
}
