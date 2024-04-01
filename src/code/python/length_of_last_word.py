class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        i = len(s) - 1

        while i >= 0 and s[i] == ' ':
            i -= 1

        start = i

        while i >= 0 and s[i] != ' ':
            i -= 1

        return start - i


if __name__ == '__main__':
    sol = Solution()
    print(sol.lengthOfLastWord("Hello World"))
    print(sol.lengthOfLastWord("   fly me   to   the moon  "))
    print(sol.lengthOfLastWord("luffy is still joyboy"))
