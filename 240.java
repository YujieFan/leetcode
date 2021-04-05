class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //向右坐标，初值为0，也叫列坐标
        int right = 0;
        //向上坐标，注意！初值为matrix.length-1，也叫行坐标
        int up = matrix.length - 1;
        //设置变量value第一个值从矩阵左下角开始:第matrix.length-1行 第0列
        // int value = matrix[up][right];

        //若矩阵为空则返回false
        if(matrix.length == 0) {
            return false;
        }
        if(matrix[0].length == 0) {
            return false;
        }
        //循环
        while(up >= 0 && right < matrix[0].length) {
            // value = matrix[up][right];
            if(matrix[up][right] == target) {
                return true;
            }
            else if(matrix[up][right] > target) {
                up -= 1;
            }         
            else {
                right += 1;
            }
        }
        return false;

    }
}