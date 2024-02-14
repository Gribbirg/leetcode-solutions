from typing import List


class Solution:
    def rearrangeArray(self, nums: List[int]) -> List[int]:
        i_pos = 0
        i_neg = 1

        res = [0] * len(nums)
        for num in nums:
            if num > 0:
                res[i_pos] = num
                i_pos += 2
            elif num:
                res[i_neg] = num
                i_neg += 2

        return res


if __name__ == '__main__':
    print(Solution().rearrangeArray([3, 1, -2, -5, 2, -4]))
    print(Solution().rearrangeArray([-1, 1]))
