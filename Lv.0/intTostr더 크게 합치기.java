class Solution {
    public int solution(int a, int b) {
        String a_str = Integer.toString(a);
        String b_str = Integer.toString(b);
        String a_b_str = a_str + b_str;
        String b_a_str = b_str + a_str;
        int a_b = Integer.valueOf(a_b_str);
        int b_a = Integer.valueOf(b_a_str);
        
        if (a_b >= b_a) {
            return a_b;
        }else{
            return b_a;
        }
    }
}
