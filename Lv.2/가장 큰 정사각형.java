import java.util.*;

class Solution {
    public int solution(int[][] board) {
        // 크기가 (board의 행 길이 + 1) x (board의 열 길이 + 1)인 map 배열을 생성
        // 기존의 board에 대한 인덱스 범위 에러를 방지하기 위해 크기를 1씩 더 늘림
        int map[][] = new int[board.length + 1][board[0].length + 1];
        int answer = 0; // 가장 큰 정사각형의 한 변의 길이를 저장할 변수

        // board 배열을 순회하여 정사각형의 최대 크기를 찾음
        for (int i = 1; i <= board.length; i++) {
            for (int j = 1; j <= board[0].length; j++) {
                // 현재 위치의 값이 0이 아닌 경우 (즉, 1인 경우)만 계산
                if (board[i - 1][j - 1] != 0) {
                    // 현재 위치를 기준으로 왼쪽, 위쪽, 왼쪽 위 대각선의 최소 값을 찾음
                    // 1을 더하여 현재 위치까지의 정사각형의 크기를 업데이트
                    int min = Math.min(Math.min(map[i][j - 1], map[i - 1][j]), map[i - 1][j - 1]);
                    map[i][j] = min + 1;

                    // 현재까지 찾은 가장 큰 정사각형의 변의 길이를 업데이트
                    answer = Math.max(answer, min + 1);
                }
            }
        }

        // 실행 중 디버깅 메시지 출력
        System.out.println("Hello Java");

        // 가장 큰 정사각형의 면적을 반환
        return answer * answer;
    }
}
