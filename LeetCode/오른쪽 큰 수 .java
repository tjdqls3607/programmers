class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        
        // 오른쪽에서 가장 큰 값을 추적하기 위한 변수
        int maxRight = -1;
        
        // 배열의 뒤에서부터 앞쪽으로 순회
        for (int i = n - 1; i >= 0; i--) {  // n-1부터 시작 (마지막 요소는 제외)
            int temp = arr[i];  // 현재 원소 값을 임시 저장
            arr[i] = maxRight;  // 현재 원소를 오른쪽에서 가장 큰 값으로 교체
            maxRight = Math.max(maxRight, temp);  // 가장 큰 값을 업데이트
        }
        
        // 마지막 요소는 항상 -1로 설정
        arr[n - 1] = -1;
        
        return arr;
    }
}
