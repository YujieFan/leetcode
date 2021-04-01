class Solution {
    public int findDuplicate(int[] nums) {
        //1.把数组从小到大排序
        Arrays.sort(nums);
        //2.遍历数组，判断如果前一项=后一项则找到重复的数
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]) {
                return nums[i];
            }
        }
        return 0;
    }
}