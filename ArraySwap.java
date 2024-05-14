import java.util.Arrays;
import java.util.Scanner;

public class ArraySwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[5];
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        Swap(arr,1,4);

    }

    static void Swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
        System.out.println(Arrays.toString(arr));
    }
}
