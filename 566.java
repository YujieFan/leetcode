class Solution {
    public void moveZeroes(int[] nums) {
        //双指针
        int j = 0;
        //遍历数组
        for(int i = 0; i < nums.length; i++) {
            //如果不为零则交换两个指针的位置上元素,非零放左边，零放右边
            if(nums[i] != 0) {
                //判断i是否＞j,若大于则说明a[j]在a[i]左边，a[i] = 0
                //避免进行i==j的交换操作
                //将交换操作换成赋值操作，不用引入temp
                if(j < i) {
                    nums[j] = nums[i];
                    nums[i] = 0;
                }
                j++;
            }
        }
    }
}