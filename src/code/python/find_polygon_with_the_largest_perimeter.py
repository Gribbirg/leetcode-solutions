from typing import List


class Solution:
    def largestPerimeter(self, nums: List[int]) -> int:
        nums.sort()
        s = 0
        res = -1

        for x in nums:
            if s > x:
                res = s + x
            s += x

        return res


if __name__ == '__main__':
    solution = Solution()
    print(solution.largestPerimeter([5, 5, 5]))
    print(solution.largestPerimeter([1, 12, 1, 2, 5, 50, 3]))
    print(solution.largestPerimeter([5, 5, 50]))
