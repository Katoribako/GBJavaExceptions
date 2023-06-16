package classwork1;

public class Task2 {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4};
        int val = arrayFilter(arr, 5, 1);
        errorLog(val);

    }
    public static int arrayFilter(int [] arr, int value, int min){
        if (arr == null){
            return -3;
        }
        if (arr.length < min){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value){
                return i;
            }

        }
        return -2;
    }
    public static void errorLog(int value){
        if (value == -2){
            System.out.println("We have no element");
        }
        if (value == -1){
            System.out.println("You need a bigger array length");
        }
        if (value == -3){
            System.out.println("Input is empty");
        }
        else {
            System.out.println(value);
        }
    }
}
