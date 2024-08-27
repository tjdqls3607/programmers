import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int a = n/100000000;
        int b = (n%100000000)/10000000;
        int c = (n%10000000)/1000000;
        int d = (n%1000000)/100000;
        int e = (n%100000)/10000;
        int f = (n%10000)/1000;
        int g = (n%1000)/100;
        int h = (n%100)/10;
        int i = (n%10)/1;
        answer = a+b+c+d+e+f+g+h+i;
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
