package classwork1;

public class Task1 {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        System.out.println(lenArray(list, 7));

    }
    public static int lenArray(int[] arr, int min) {
        int len = arr.length;
        if (len < min){
            return -1;
        }
        return len;
    }
}
