class Solution(object):
    def countSubstrings(self, s):
        # aaaabaabaa 单数中心：b, aba, aabaa; 偶数中心：aa, aaaa
        # 1.定义一个spread函数，扩散次数=回文子串个数
        def spread(s, left, right):
            # count为扩散次数，没扩散一次增加一个新的回文子串
            count = 0
            # 循环遍历字符串s，如果char[left] = char[right]则 count+1
            while left >= 0 and right < len(s) and s[left] == s[right]:
                left -= 1
                right += 1
                count += 1
            return count
        # 2.按回文类型分类讨论
        result = 0
        # 循环遍历字符串s的角标
        for i in range(len(s)):
            result += spread(s, i, i) # 单数中心
        for i in range(len(s)- 1):
            result += spread(s, i, i + 1) #偶数中心
        return result

