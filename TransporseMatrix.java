import java.util.Arrays;

public class TransporseMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,5},
                {4,5,6,6} };
        //int[][] ans=transporse(arr);
        //System.out.println(Arrays.toString(ans));
        transporse(arr);
    }
    public static void transporse(int[][] arr) {
        int[][] transpose = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                 transpose[i][j] = arr[j][i];
            }
        }
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
