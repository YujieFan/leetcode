class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        //1.1如果矩阵中只有一行或一列，则返回true
        if(matrix.length == 1 || matrix[0].length == 1) {
            return true;
        }
        //1.2只需判断每个数是否与左上角的数相等即可不等于则返回false
        //遍历矩阵
        for(int i = 1; i < matrix.length; i++) {
            for(int j = 1; j < matrix[0].length; j++) {
                if(matrix[i][j] != matrix[i-1][j-1]) {
                    return false;
                } 
            }
        }
        return true;
    }
}