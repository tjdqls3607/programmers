import java.util.*;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        while(true){
        int largeB = Math.max(bill[0],bill[1]);
        int smallB = Math.min(bill[0],bill[1]);
        int largeW = Math.max(wallet[0],wallet[1]);
        int smallW = Math.min(wallet[0],wallet[1]);


        if (smallB>smallW || largeB>largeW){
            if(bill[0]>bill[1]){
                bill[0] = bill[0]/2;
            } else{
                bill[1] = bill[1]/2;
            }
            answer++;
        } else {
            break;
        }
        }
        return answer;
    }
}
