class Solution {
    public int solution(int num, int n) {
        int answer = 0;
        if (num%n == 0) {
            answer = answer + 1;
        }else{
            answer = answer + 0;
        }
        return answer;
    }
}
