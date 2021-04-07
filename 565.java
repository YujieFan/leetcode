class Solution {
    public int arrayNesting(int[] nums) {
        //result变量用来记录output,最大的数组长度
        int result = 0;
        //遍历数组
        for(int i = 0; i < nums.length; i++) {
            //循环 如果没有遇到nums[k] = -1 则继续循环,并计数count
            //数组角标i会和数组的值互换，则设立新变量k=i
            int count = 0;
            int k = i;
            while(nums[k] != -1) {
                //temp用来存数组的值
                int temp = nums[k];
                //遍历了nums[k]就将其标记为-1
                nums[k] = -1;
                //更新角标k为数组的值
                k = temp;
                //数组长度增加1
                count++;
            }
            result = Math.max(result, count);
        }
        return result;
    }
}