class Solution(object):
    def isAnagram(self, s, t):
        # 判断s和t是否长度相同
        if len(s) != len(t):
            return False
        # 将字符串s去重去序
        se = set(s)
        # 判断去重去序后的字符串s和t是否相等
        if se == set(t):
            # 循环判断s中每个字符的数量是否与t中数量相等
            for i in se:
                if s.count(i) != t.count(i):
                    return False
            return True
        else:
            return False