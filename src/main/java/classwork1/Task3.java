package classwork1;

public class Task3 {
    public static void main(String[] args) {
        numBin(new int[][] {{1, 0 , 1},
                {0, 0 , 0}, {1, 0 , 0}});
        //numBin(new int[][]{{1, 2, 1}, {1, 2, 2}, {1, 2, 2}});
        numBin(new int[][]{{1, 0, 1}, {1, 0, 0}});

    }
    public static int numBin(int [][] arr){
        int sum =0;
        if(arr.length != arr[0].length){
            throw new RuntimeException("Matrix is not square");

        }
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr[1].length; j++) {
                if (arr[i][j] != 0 && arr[i][j] != 1){
                    throw new RuntimeException("Value is could be only 1 or 0 ");

                }
                sum = sum + arr[i][j];
            }

        }
        return sum;
    }
}
