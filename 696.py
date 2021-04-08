class Solution:
    def countBinarySubstrings(self, s: str) -> int:
        def spread(s, left, right):
            count = 0
            left_char = s[left]
            right_char = s[right]
            while left >= 0 and right < len(s) and s[left] == left_char and \
                 s[right]== right_char:
                 count += 1
                 left -= 1
                 right += 1
            return count
        
        result = 0
        # 遍历字符串s的角标
        for i in range(len(s) - 1):
            # 中间为01向两边扩散
            if s[i] == '0' and s[i + 1] == '1': 
                result += spread(s, i, i+1)
            if s[i] == '1' and s[i + 1] == '0':
                result += spread(s, i, i+1)
        return result 