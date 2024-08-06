import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int n = s.length();
        int openCount = 0;
        int closeCount = 0;
        for (int i=0; i<s.length(); i++) {
            s.charAt(i);
            if (s.charAt(i) == '('){
                openCount++;
            }else if (s.charAt(i) ==')') {
                closeCount++;
            }
            if (openCount < closeCount) {
                return false;
            }
        }
        if (openCount == closeCount) {
            return true;
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return false;
    }
}
