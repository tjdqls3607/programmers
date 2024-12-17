import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> output = new ArrayList<>();   // output을 ArrayList로 선언

        Set<Integer> numSet = new HashSet<>();   // Set을 사용하여 nums 배열의 모든 값을 추가
        for (int num : nums) {
            numSet.add(num);  // nums 배열의 값을 Set에 추가하여 중복 제거
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!numSet.contains(i)) {  // Set에 i가 없으면 누락된 숫자
                output.add(i);  // 누락된 숫자를 output 리스트에 추가
            }
        }

        return output;  // 누락된 숫자들을 담은 리스트를 반환
    }
}
