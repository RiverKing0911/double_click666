package m8.d10;

/**
 * 双重for循环打印杨辉三角
 * Created by 王江 on 2017/8/10.
 */
public class YangHuiTriangle {
    public static void main(String[] args) {
        int[][] triangle = new int[10][];
        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                if (i == 0 || j == 0 || i == j) {
                    triangle[i][j] = 1;
                } else {
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }
                System.out.print(triangle[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
