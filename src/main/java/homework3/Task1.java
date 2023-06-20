package homework3;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        try {
            Map<String, Object> data = readUserData();
            writeUserDataToFile(data);
            System.out.println("Данные успешно записаны в файл.");
        } catch (InputDataException e) {
            System.out.println("Ошибка ввода данных: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка чтения/записи файла: " + e.getMessage());
        }
    }

    public static Map<String, Object> readUserData() throws InputDataException {
        Scanner scanner = new Scanner(System.in);
        Map<String, Object> data = new HashMap<>();

        System.out.print("Введите данные (Фамилия Имя Отчество ДатаРождения НомерТелефона Пол):" +
                " (Используйте пары ключ=значение (Например НомерТелефона=123) " +
                "разделяйте данные с помощью пробела ");
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");

        for (String item : inputArray) {
            String[] keyValue = item.split("=");
            if (keyValue.length != 2) {
                throw new InputDataException("Неверный формат данных.");
            }
            String key = keyValue[0];
            String value = keyValue[1];
            data.put(key, value);
        }

        // Проверка наличия всех требуемых данных
        if (data.size() != 6) {
            throw new InputDataException("Неверное количество данных.");
        }

        // Проверка формата данных
        String birthDate = (String) data.get("ДатаРождения");
        if (!birthDate.matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
            throw new InputDataException("Неверный формат даты рождения. Используйте формат dd.mm.yyyy.");
        }

        try {
            int phoneNumber = Integer.parseInt((String) data.get("НомерТелефона"));
            if (phoneNumber < 0) {
                throw new InputDataException("Неверный формат номера телефона. Используйте целое число без знака.");
            }
            data.put("НомерТелефона", phoneNumber);
        } catch (NumberFormatException e) {
            throw new InputDataException("Неверный формат номера телефона. Используйте целое число без знака.");
        }

        String gender = ((String) data.get("Пол")).toUpperCase();
        if (!gender.equals("F") && !gender.equals("M")) {
            throw new InputDataException("Неверное значение для пола. Используйте F или M.");
        }
        data.put("Пол", gender);

        return data;
    }

    public static void writeUserDataToFile(Map<String, Object> data) throws IOException {
        String surname = (String) data.get("Фамилия");
        String name = (String) data.get("Имя");
        String patronymic = (String) data.get("Отчество");
        String birthDate = (String) data.get("ДатаРождения");
        int phoneNumber = (int) data.get("НомерТелефона");
        String gender = (String) data.get("Пол");

        String fileName = surname + ".txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
        writer.write(surname + " " + name + " " + patronymic + " " + birthDate + " " + phoneNumber + " " + gender);
        writer.newLine();
        writer.close();
    }
}