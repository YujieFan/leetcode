class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        //1将二维矩阵的值依次输出到一维矩阵

        //创建一维数组用来装二维数组的值，长度为二维数组的值的个数
        int[] newMatrix = new int[matrix.length * matrix[0].length];
        //嵌套循环遍历二维数组
        int index = 0; //newMatrix的角标
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                newMatrix[index++] = matrix[i][j];
            }
        }
        //2.将一维数组按ascending order排序 从小到大排序
        Arrays.sort(newMatrix);
        //3.找到第k个最小的值
        return newMatrix[k-1];


    }
}