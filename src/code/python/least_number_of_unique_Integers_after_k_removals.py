from typing import List


class Solution:
    def findLeastNumOfUniqueInts(self, arr: List[int], k: int) -> int:
        nums_map = {}
        for num in arr:
            nums_map[num] = nums_map.get(num, 0) + 1

        sorted_count = sorted(nums_map.values())

        i = 0
        while i < len(sorted_count) and sorted_count[i] <= k:
            k -= sorted_count[i]
            i += 1

        return len(sorted_count) - i


if __name__ == '__main__':
    sol = Solution()
    print(sol.findLeastNumOfUniqueInts([5, 5, 4], 1))
    print(sol.findLeastNumOfUniqueInts([4, 3, 1, 1, 3, 3, 2], 3))
