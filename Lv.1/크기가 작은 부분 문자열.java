import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int length = p.length();
        for (int i=0; i<=t.length()-length; i++){
            String substring = t.substring(i, i + length);
            if (p.compareTo(substring) >= 0){
                answer++;
            }
        }
        
        return answer;
    }
}
