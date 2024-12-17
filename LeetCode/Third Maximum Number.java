import java.util.*;

class Solution {
    public int thirdMax(int[] nums) {
        // 1. 중복을 제거하기 위해 Set을 사용
        Set<Integer> uniqueNums = new TreeSet<>(Collections.reverseOrder());
        
        // 2. nums 배열의 값들을 Set에 추가하여 중복 제거
        for (int num : nums) {
            uniqueNums.add(num);
        }

        // 3. Set의 크기를 확인하여 세 번째로 큰 값을 결정
        if (uniqueNums.size() < 3) {
            // 세 개 미만의 고유 값이면 가장 큰 값을 반환
            return uniqueNums.iterator().next();  // Set의 첫 번째 값 (가장 큰 값)
        }

        // 4. 세 번째로 큰 값이 있을 때는 세 번째 값을 반환
        Iterator<Integer> iterator = uniqueNums.iterator();
        iterator.next();  // 첫 번째로 큰 값
        iterator.next();  // 두 번째로 큰 값
        return iterator.next();  // 세 번째로 큰 값
    }
}
