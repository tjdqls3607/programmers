class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        int j = overwrite_string.length();
        int l = my_string.length();
        answer = my_string.substring(0, s) + overwrite_string + my_string.substring(s+j,l);
        return answer;
    }
}
