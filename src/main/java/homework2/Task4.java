package homework2;
//Разработайте программу, которая выбросит Exception,
// когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение,
// что пустые строки вводить нельзя.

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        String input = readStringFromUser();
        System.out.println("You entered: " + input);
    }

    public static String readStringFromUser() {
        Scanner scanner = new Scanner(System.in);
        String input = null;
        while (input == null || input.isEmpty()) {
            System.out.print("Please input a text: ");
            input = scanner.nextLine();
            if (input.isEmpty()) {
                throw new IllegalArgumentException("Empty string!!");
            }
        }
        scanner.close();
        return input;
    }

}
