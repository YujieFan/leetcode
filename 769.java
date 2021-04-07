class Solution {
    public int maxChunksToSorted(int[] arr) {
        int diff = 0, i = 0, result = 0;
        while(i < arr.length) {
            //diff为y=x与permutation线段之间的差值和  
            //arr[i]为permutation线段
            //i相当于我们最终要得到的y=x直线上的值
            diff += arr[i] - i;
            //如果两线段差值和=0，则可以截一块
            if(diff == 0) {
                result += 1;
            }
            i++;
        }
        return result;
    }
}