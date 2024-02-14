from typing import Optional

from src.code.python.structures.list_node import ListNode


class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        visited = set()
        current = head

        while current:
            if current in visited:
                return True

            visited.add(current)
            current = current.next

        return False


if __name__ == '__main__':
    head = ListNode(3)
    head.next = ListNode(2)
    head.next.next = ListNode(0)
    head.next.next.next = ListNode(-4)
    head.next.next.next.next = head.next.next
    print(Solution().hasCycle(head))
