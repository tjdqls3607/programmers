class Solution {
    public boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                // 자기 자신을 제외한 경우, arr[i]는 arr[j]의 두 배이거나 arr[j]는 arr[i]의 두 배일 때
                if (i != j && arr[i] == 2 * arr[j]) {
                    return true; // 조건을 만족하면 즉시 true 반환
                }
            }
        }
        
        return false; // 모든 경우를 확인해도 없으면 false 반환
    }
}
