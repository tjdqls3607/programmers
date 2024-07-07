class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;
        if (number%n==0 && number%m==0) {
            answer = answer + 1;
        }else {
            answer = answer +0;
        }
        return answer;
    }
}
