import java.util.*;

class Solution {
    public void duplicateZeros(int[] arr) {
        // 배열을 한 번 더 복사할 필요는 없습니다. 직접 수정하는 방식으로 작업합니다.
        int n = arr.length;
        
        // 배열을 뒤에서부터 탐색하여, 0을 발견하면 그 뒤에 0을 추가
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == 0) {
                // 두 칸씩 밀기
                for (int j = n - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                if (i + 1 < n) {
                    arr[i + 1] = 0;  // 두 번째 0을 넣음
                }
            }
        }
    }
}
