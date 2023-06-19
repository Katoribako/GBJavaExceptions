package homework2;
//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
// вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        float number = readFloatFromUser();
        System.out.println("You entered: " + number);
    }

    public static float readFloatFromUser() {
        Scanner scanner = new Scanner(System.in);
        float number = 0;
        boolean validInput = false;
        while (!validInput) {
            System.out.print("Enter a float number: ");
            String input = scanner.nextLine();
            try {
                number = Float.parseFloat(input);
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a float number.");
            }
        }
        scanner.close();
        return number;
    }
}
