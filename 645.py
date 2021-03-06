class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        dup = sum(nums) - sum(set(nums))
        missing = sum(range(len(nums) + 1)) - sum(set(nums))
        return [dup, missing]