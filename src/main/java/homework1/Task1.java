package homework1;

import java.util.Arrays;

import static homework1.Filter.arrayFilter;
import static homework1.Filter.errorLogger;

//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива
//  и возвращающий новый массив, каждый элемент которого равен разности элементов
// двух входящих массивов в той же ячейке. Если длины массивов не равны,
// необходимо как-то оповестить пользователя.
public class Task1 {
    public static void main(String[] args) {
        Integer [] arr = {1, 2, 3, 4 };
        Integer [] arr2 = {1, 2, 3, 4, 5 };
        Integer [] arr3 = null;
        Integer [] arr4 = {1, 2, 3, 7 };

        errorLogger(arrayFilter(arr, arr4));
        System.out.println(Arrays.toString(difference(arr, arr4)));
        //arrayFilter(arr, arr3);
        //System.out.println(Arrays.toString(difference(arr, arr3)));
        //arrayFilter(arr, arr2);
        //System.out.println(Arrays.toString(difference(arr, arr2)));

    }

    public static Integer [] difference(Integer[] arr1, Integer[] arr2){
        Integer [] diffArray = new Integer[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            diffArray[i] = arr1[i] - arr2[i];

        }
        return diffArray;
    }
}
