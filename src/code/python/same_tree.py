from src.code.python.structures.tree_node import TreeNode


class Solution(object):
    def isSameTree(self, p, q):
        """
        :type p: TreeNode
        :type q: TreeNode
        :rtype: bool
        """
        return (p.val == q.val and
                self.isSameTree(p.left, q.left)
                and self.isSameTree(p.right, q.right)) \
            if p is not None and q is not None \
            else p == q


if __name__ == '__main__':
    solution = Solution()
    print(solution.isSameTree(TreeNode(1, TreeNode(2), TreeNode(3)), TreeNode(1, TreeNode(2), TreeNode(3))))
