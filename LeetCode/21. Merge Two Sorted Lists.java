public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    if (list1 == null) return list2;  // list1이 비어 있으면 list2 반환
    if (list2 == null) return list1;  // list2가 비어 있으면 list1 반환

    ListNode dummy = new ListNode(0);  // 가상의 시작 노드
    ListNode current = dummy;          // 현재 위치 노드

    while (list1 != null && list2 != null) {
        if (list1.val < list2.val) {  // list1의 값이 더 작으면
            current.next = list1;     // current의 다음 노드로 list1 연결
            list1 = list1.next;       // list1을 다음 노드로 이동
        } else {                      // list2의 값이 더 작거나 같으면
            current.next = list2;     // current의 다음 노드로 list2 연결
            list2 = list2.next;       // list2를 다음 노드로 이동
        }
        current = current.next;       // current 노드를 다음으로 이동
    }

    // 남은 노드를 연결 (둘 중 하나는 이미 null)
    current.next = (list1 != null) ? list1 : list2;

    return dummy.next;  // 가상의 시작 노드 다음 노드를 반환
}
