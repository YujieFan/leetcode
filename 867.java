class Solution {
    public int[][] transpose(int[][] matrix) {
        //获取matrix的行数
        int a = matrix.length;
        //获取matrix的列数
        int b = matrix[0].length;
        //创建一个新数组用来装transepose matrix
        int[][] transposeMatrix = new int[b][a];
        //遍历matrix
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < b; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }
        return transposeMatrix;

    }
}