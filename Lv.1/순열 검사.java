import java.util.*;

class Solution {
    public boolean solution(int[] arr) {
        boolean answer = true;
        Arrays.sort(arr);
        for (int i=0; i<arr.length; i++){
            answer = arr[i]==i+1 ? true:false;
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
