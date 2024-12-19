class Solution {
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;  // 리스트가 비어 있거나 원소가 하나면 정렬 필요 없음
        }

        ListNode dummy = new ListNode(0);  // 가상의 시작 노드
        ListNode current = head;  // 현재 노드를 추적
        
        while (current != null) {
            ListNode nextNode = current.next;  // 다음 노드 임시 저장

            // 정렬된 위치 찾기
            ListNode prev = dummy;
            while (prev.next != null && prev.next.val < current.val) {
                prev = prev.next;
            }

            // 현재 노드를 새 위치로 이동
            current.next = prev.next;
            prev.next = current;

            current = nextNode;  // 다음 노드로 이동
        }

        return dummy.next;  // 정렬된 리스트의 시작 반환
    }
}
