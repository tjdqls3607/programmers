import java.util.*;

class Solution {
    public long pickGifts(int[] gifts, int k) {
        long sum = 0;

        // 우선순위 큐를 사용해 최대값을 효율적으로 처리
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        for (int gift : gifts) {
            maxHeap.add(gift); // 모든 값을 우선순위 큐에 삽입
        }

        // k번 반복하며 가장 큰 값을 처리
        for (int i = 0; i < k; i++) {
            if (!maxHeap.isEmpty()) {
                int largest = maxHeap.poll(); // 최대값 가져오기
                int reduced = (int) Math.sqrt(largest); // 제곱근 계산
                maxHeap.add(reduced); // 감소된 값 다시 추가
            }
        }

        // 큐에 남아 있는 모든 값의 합 계산
        while (!maxHeap.isEmpty()) {
            sum += maxHeap.poll();
        }

        return sum;
    }
}
