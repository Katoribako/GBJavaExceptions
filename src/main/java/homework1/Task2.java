package homework1;
//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
// и возвращающий новый массив, каждый элемент которого равен частному элементов
// двух входящих массивов в той же ячейке. Если длины массивов не равны,
// необходимо как-то оповестить пользователя. Важно:
// При выполнении метода единственное исключение,
// которое пользователь может увидеть - RuntimeException, т.е. ваше.

import java.util.Arrays;

import static homework1.Filter.arrayFilter;
import static homework1.Filter.errorLogger;

public class Task2 {
    public static void main(String[] args) {
        Integer [] arr = {1, 2, 3, 4 };
        Integer [] arr2 = {1, 2, 3, 4, 5 };
        Integer [] arr3 = null;
        Integer [] arr4 = {1, 2, 3, 2 };
        Integer [] arr5 = {1, 2, 3, 0 };
        errorLogger(arrayFilter(arr, arr4));
        System.out.println(Arrays.toString(division(arr, arr4)));

    }
    public static Double[] division(Integer[] arr1, Integer[] arr2){
        Double [] divArray = new Double[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0 || arr2[i] == 0){
                throw new RuntimeException("You can't divide by zero!");
            }
            else {
                divArray[i] = (double) (arr1[i] / arr2[i]);
            }

        }
        return divArray;
    }
}
