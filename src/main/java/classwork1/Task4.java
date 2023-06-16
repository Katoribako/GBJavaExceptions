package classwork1;

public class Task4 {
    public static void main(String[] args) {
        Integer [] arr = {1, 2, 3, 4 };
        //Integer [] arr1 = {null, 1, 2, 3};
        checkArray(arr);
        //checkArray(arr1);
    }
    public static void checkArray(Integer []arr){
        String  nullList = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                nullList = nullList + " " + i;
            }
        }
        if (nullList != ""){
            throw new RuntimeException("index of errors" + nullList);
        }
        else {
            System.out.println("We have no errors");
        }
    }
}
