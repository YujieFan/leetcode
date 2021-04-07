class Solution(object):
    def longestPalindrome(self, s):
        # 统计字符串中每个字符的词频
        count = collections.Counter(s);
        # 变量center代表回文数中的中心数
        centerValue = 0
        longLength = 0
        # 循环判断各个字符的词频奇偶
        for char in count:
            # 如果count为偶,则直接将其加入结果
            if count[char] % 2 == 0:
                longLength += count[char]
            # 如果count为奇，可以写成偶数次+1的形式，偶数次直接加入结果,再随便选一个作为center
            else:
                centerValue = 1 # 存在count为奇数,选一个作为center
                longLength += count[char] - 1 #偶数次直接加入结果
        return longLength + centerValue