class Solution {
    public boolean containsDuplicate(int[] nums) {
        // //排序
        // Arrays.sort(nums);
        // //判断前一项与后一项是否相等
        // for(int i = 0; i < nums.length - 1; i++) {
        //     if(nums[i] == nums[i+1]) {
        //         return true;
        //     }
        // }
        // return false;

        //建立hashset
        Set<Integer> set = new HashSet<>();
        //将数组里的值放入hashset：获得去重后的数组
        for(int num : nums) {
            set.add(num);
        }
        return set.size() < nums.length;


    }
}