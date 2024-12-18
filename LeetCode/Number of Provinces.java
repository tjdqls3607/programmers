class Solution {
    // 주어진 isConnected 배열을 이용해 서로 연결된 도시들의 그룹(provinces)을 찾는 함수
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;  // 도시의 수
        boolean[] visited = new boolean[n];  // 각 도시가 방문되었는지 확인하는 배열
        int provinces = 0;  // province의 수를 셀 변수

        // 모든 도시를 순차적으로 검사
        for (int i = 0; i < n; i++) {
            // 해당 도시가 아직 방문되지 않았다면, 새로운 province 탐색 시작
            if (!visited[i]) {
                // DFS로 연결된 모든 도시를 방문
                dfs(isConnected, visited, i);
                // 새로운 province를 찾았으므로 provinces 수를 증가
                provinces++;
            }
        }
        
        return provinces;  // province의 수 반환
    }

    // DFS를 사용하여 주어진 도시와 연결된 모든 도시를 방문
    private void dfs(int[][] isConnected, boolean[] visited, int city) {
        visited[city] = true;  // 현재 도시를 방문 처리

        // 해당 도시와 연결된 다른 도시들을 탐색
        for (int i = 0; i < isConnected.length; i++) {
            // 도시 `city`와 도시 `i`가 연결되어 있고, `i` 도시가 아직 방문되지 않았다면
            if (isConnected[city][i] == 1 && !visited[i]) {
                // 연결된 도시 `i`로 DFS를 재귀적으로 호출
                dfs(isConnected, visited, i);
            }
        }
    }
} Number of Provinces
