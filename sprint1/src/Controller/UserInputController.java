package Controller;

import java.util.Scanner;

public class UserInputController {
    private static Scanner scanner = new Scanner(System.in);

    public static InputType getUserInput() {
        InputType input;

        while (true) {
            System.out.println("Please enter gugudan or calculator or star:");
            String inputString = scanner.nextLine();

            try {
                input = InputType.valueOf(inputString.toUpperCase());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input. Please enter gugudan or calculator or star.");
            }
        }

        return input;
    }

}
