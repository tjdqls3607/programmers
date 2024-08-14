import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        // 반환할 배열을 선언 (초기값은 빈 배열, 하지만 실제로는 players 배열을 반환할 것)
        String[] answer = {};
        
        // 각 선수의 이름을 키(key)로 하고, 현재 순위를 값(value)으로 저장하는 맵(Map)을 생성
        Map<String, Integer> map = new HashMap<>();
        
        // players 배열을 순회하면서 선수의 이름과 그들의 현재 순위를 맵에 저장
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i); // 각 선수의 이름과 해당하는 인덱스를 맵에 저장
        }
        
        // callings 배열에 있는 선수 이름을 순차적으로 처리
        for (String player : callings) {
            // 호출된 선수의 현재 순위를 맵에서 가져옴
            int ranking = map.get(player);
            
            // 현재 순위에서 한 단계 위에 있는 선수를 찾음
            String upranking = players[ranking - 1];
            
            // 위 선수의 순위를 한 단계 아래로 업데이트
            map.replace(upranking, ranking);
            players[ranking] = upranking;
            
            // 호출된 선수의 순위를 한 단계 위로 업데이트
            map.replace(player, ranking - 1);
            players[ranking - 1] = player;
        }
        
        // 최종적으로 업데이트된 players 배열을 반환
        return players;
    }
}
