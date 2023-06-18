package classwork2;
//Ann=5
//July=7
//Alen=2
//Den=4

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("testtask1.txt");
        HashMap<String, Integer> map = new HashMap<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split("=");
                String key = parts[0];
                String valueString = parts[1];
                System.out.println(line);
                int value;
                if (valueString.equals("?")) {
                    value = key.length();
                    System.out.println("added" +" " + value + " "+"to" +" "+ key);
                } else {
                    value = Integer.parseInt(valueString);
                }
                map.put(key, value);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(map);
        System.out.println(writeDataToFile(file, map));
    }
    public static String writeDataToFile(File file, HashMap<String, Integer> map) {
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for (String key : map.keySet()) {
                int value = map.get(key);
                if ( value == '?'|| value != key.length()) {
                    bw.write(key + "=" + key.length());
                    System.out.println("Changed value for key " + key + " to " + key.length());
                } else {
                    bw.write(key + "=" + value);
                }
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
