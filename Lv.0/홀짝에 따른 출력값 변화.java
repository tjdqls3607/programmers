class Solution {
    public int solution(int n) {
        int answer = 0;
        if (n%2==0){
            for (int i=2; i<=n; i+=2) {
                answer = answer + i*i;
            }
        }else if (n%2==1) {
            for (int j=1; j<=n; j+=2) {
                answer = answer +=j;
            }
        }
        return answer;
    }
}
