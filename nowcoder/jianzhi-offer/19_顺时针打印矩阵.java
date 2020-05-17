import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
       if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0)
           return null;
        //最外圈有几行几列
        int rows = matrix.length, cols = matrix[0].length;
        //偏移量, 从顶点沿对角线向中心移动
        int offset = 0;
        ArrayList<Integer> res = new ArrayList<>();
        while (rows > 0 && cols > 0) {
            printMatrixCore(matrix, rows, cols, offset, res);
            //每打印一圈减少两行两列, 偏移量向中心移动一位
            rows -= 2;
            cols -= 2;
            offset++;
        }
        return res;
    }
    //顺时针打印一圈
    private void printMatrixCore(int[][] matrix, int rows, int cols, int offset, ArrayList<Integer> res) {
        //只有一行或一列的情况要单独考虑
        if (rows == 1) {
            for (int i = 0; i < cols; i++) res.add(matrix[offset][offset + i]);
            return;
        }
        if (cols == 1) {
            for (int j = 0; j < rows; j++) res.add(matrix[offset + j][offset + cols - 1]);
            return;
        }
        for (int i = 0; i < cols - 1; i++) res.add(matrix[offset][offset + i]);
        for (int j = 0; j < rows - 1; j++) res.add(matrix[offset + j][offset + cols - 1]);
        for (int i = 0; i < cols - 1; i++) res.add(matrix[offset + rows - 1][offset + cols - 1 - i]);
        for (int j = 0; j < rows - 1; j++) res.add(matrix[offset + rows - 1 - j][offset]);
    }
}