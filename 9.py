class Solution(object):
    def isPalindrome(self, x):
        #先将int转换为string才能使用len()
        x = str(x)
        #中间有两个数
        if len(x) % 2 == 0:
            # 中间第二个字符坐标
            left = len(x) / 2
            # 中间第一个字符坐标
            right = len(x) / 2 - 1
            # 如果中间两个数相等则继续判断两边是否对称相等
            while left >= 0 and right < len(x):
                if x[left] == x[right]:
                    left -= 1
                    right += 1
                else:
                    return False
            return True
        #中间只有一个数
        else:
            #中间的数的位置坐标
            center = len(x) // 2
            left1 = center - 1
            right1 = center + 1
            # 判断center两端数是否对称相等
            while left1 >= 0 and right1 < len(x):
                if x[left1] == x[right1]:
                    left1 -= 1
                    right1 += 1
                else:
                    return False
            return True
