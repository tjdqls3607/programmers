class Solution {
    public int solution(String[][] board, int h, int w) {
        int n = board.length; //board.length를 저장하는 n 선언
        int count = 0; // 같은색으로 색칠된 칸의 갯수를 구할 int 변수 선언
        int[] dh = {0, 1, -1, 0}; //변화량을 저장할 리스트 선언
        int[] dw = {1, 0, 0, -1}; //위와 동일
        for (int i=0; i<4; i++) {
            int h_check = h+dh[i]; //h좌표를 알아내는 변수 설정
            int w_check = w+dw[i]; //w좌표를 알아내는 변수 설정
            if (h_check>=0 && h_check<n && w_check>=0 && w_check<n){ //h_check와 w_check가 0 이상 배열 길이 미만이면 다음을 수행
                if (board[h][w].equals(board[h_check][w_check])){ //보드좌표와 h_check,w_check 가 같다면
                    count++; //증가
                }       
            }

        }
       return count;
    }
}
