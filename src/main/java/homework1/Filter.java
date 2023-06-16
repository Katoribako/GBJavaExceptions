package homework1;

public class Filter {
    public static Integer arrayFilter(Integer [] arr1, Integer[] arr2){
        if (arr1 == null || arr2 == null){
            return 1;
        }
        if (arr1.length != arr2.length){
            return 2;
        }
        return 3;
    }
    public static void errorLogger(Integer value){
        if (value == 1){
            throw new RuntimeException("One or all of arrays is empty!");
        }
        if (value == 2){
            throw new RuntimeException("First array's length is not equal with second array");
        }
        else{
            System.out.println("everything ok");
        }
    }
}
