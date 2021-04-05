class Solution {
    public int findShortestSubArray(int[] nums) {
        //1.分类讨论
        //1.1若数组为空或不为空但没有任何元素，则返回0
        if(nums == null || nums.length == 0) {
            return 0;
        }
        //1.2若数组只有一个元素，数组的度为1，最小连续子集也为1，则返回1
        if(nums.length == 1) {
            return 1;
        }
        //2.设立map1用来记录数组元素出现的次数
        //HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
        Map<Integer, Integer> map1 = new HashMap<>(); //更加灵活地通过接口引用对象
        //3.设立map2用来记录数组元素第一次出现的位置
        Map<Integer, Integer> map2 = new HashMap<>();
        //4.设立map3用来记录数组中相同元素第一次与最后一次出现之间的位置长度
        Map<Integer, Integer> map3 = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            //获取数组元素及其出现的次数赋值给map1 key = 数组元素 value = 出现的次数
            //getOrDefault(key,0)：返回key所对应的value,若没有则返回0
            map1.put(nums[i], map1.getOrDefault(nums[i], 0) + 1);
            //map2 key = 数组元素, value = 第一次出现的位置
            //containsKey(key))：检查hashmap中是否存在key所对应的映射关系
            if(!map2.containsKey(nums[i])) {
                map2.put(nums[i], i);
            }
            //map3 key = 数组元素， value = (end-first)+1
            map3.put(nums[i], i - map2.get(nums[i]) + 1);
        }
        //5.设立maxCount变量记录map1中数组元素次数的最大值为数组的度
        int maxCount = 0;
        //遍历hashmap map1 中的所有value
        for(int value : map1.values()) {
            maxCount = Math.max(maxCount, value);
        }
        //6.设立minLength变量记录与原数组拥有相同的度的最小连续子集的长度
        //初值要设为最大，才能循环找出更小。Integer.MAX_VALUE为整型中的最大值
        int minLength = Integer.MAX_VALUE;
        //keySet()：返回hashmap中所有key的集合
        for(int key : map1.keySet()) {
            if(maxCount == map1.get(key)) {
                minLength = Math.min(minLength, map3.get(key));
            }
        }
        return minLength;

    }
}