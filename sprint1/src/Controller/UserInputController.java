package Controller;

import java.util.Scanner;

public class UserInputController {
    private static Scanner scanner = new Scanner(System.in);

    public static String getUserInput() {
        String input;

        while (true) {
            System.out.println("Please enter gugudan or calculator or star:");
            input = scanner.nextLine();

            if (input.equals("gugudan") || input.equals("calculator") || input.equals("star")) {
                return input;
            }

            System.out.println("Invalid input. Please enter gugudan or calculator or star.");
        }
    }

}
