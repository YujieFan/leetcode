class Solution {
    public boolean isIsomorphic(String s, String t) {
        //建立hashmap用来存键值对 key=s中的元素 value=t中的元素
        Map<Character,Character> map = new HashMap<>();
        //判断如果两字符串长度不相等 则无法异构，直接返回false
        if(s.length() != t.length()) {
            return false;
        }
        //循环将s和t字符串中的元素放进hashmap, key=s value=t
        for(int i = 0; i < s.length(); i++) {
            //s中的字符 charAt()返回指定索引处的字符
            char s_char = s.charAt(i);
            //t中的字符
            char t_char = t.charAt(i);

            //判断是否存在key           
            if(map.containsKey(s_char)) {
                //如果已经存在key s_char,则判断其所对应的value是否与之前的value相等
                if(map.get(s_char) != t_char) {
                    return false;
                }
            } else { //不存在相同的key的情况下，判断是否存在相同value，若存在则false
                if(map.containsValue(t_char)) {
                    return false; //value为一对多关系映射则false
                }
                //hashmap中装两字符串的一一对应的映射关系
                map.put(s_char, t_char);
            }
        }
        return true;
    }
}