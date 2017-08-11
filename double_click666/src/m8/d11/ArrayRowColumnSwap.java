package m8.d11;

/**
 * 二维数组行列互换
 * Created by 王江 on 2017/8/11.
 */
public class ArrayRowColumnSwap {

    public static void main(String[] args) {
        int arr[][] = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("行列互换前：");
        printArray(arr);
        int arr2[][] = swap(arr);
        System.out.println("行列互换后：");
        printArray(arr2);
    }

    //打印数组
    private static void printArray(int arr[][]) {
        for (int[] anArr : arr) {
            for (int anAnArr : anArr) {
                System.out.print(anAnArr + "\t");
            }
            System.out.println();
        }
    }

    //行列互换
    private static int[][] swap(int arr[][]){
        int arr2[][] = new int[arr.length][arr.length];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                arr2[i][j]=arr[j][i];
            }
        }
        return arr2;
    }
}
