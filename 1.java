//**********************方法一：暴力
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int[] result = new int[2];
//         for(int i = 0; i < nums.length; i++) {
//             for(int j = 0; j < nums.length; j++){
//                 if(i != j) {
//                     int sum = nums[i] + nums[j];
//                     if(sum == target) {
//                         result[0] = Math.min(i, j);
//                         result[1] = Math.max(i, j);
//                     }
//                 }
//             }
//         }
//         return result;
//     }
// }

//*********************方法二：hashmap 
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        //建立hashmap key=nums[i] value=i
        Map<Integer, Integer> map = new HashMap<>();
        //遍历数组
        for(int i = 0; i < nums.length; i++) {
            //判断target-nums[i]是否在map里
            if(map.containsKey(target - nums[i])) {
                result[0] = map.get(target - nums[i]);
                result[1] = i;
            } else {
                map.put(nums[i], i);
            }
        }
        return result;
    }
}
