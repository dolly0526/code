public class Solution {
    public boolean Find(int target, int [][] array) {
        //排除特殊情况
        int rows = array.length, cols = array[0].length;
        if (rows == 0 || cols == 0) return false;
        
        //从左下开始找, 若target偏大则往右, 若target偏小则往上, 每次可以剔除一整行或一整列
        int x = rows - 1, y = 0;
        while (x >= 0 && y < cols) {
            if (array[x][y] < target) y++;
            else if (array[x][y] > target) x--;
            else return true;
        }
        return false;
    }
}