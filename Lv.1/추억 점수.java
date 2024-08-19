import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String, Integer>photos = new HashMap<>();
        for (int i=0; i<name.length; i++){
            photos.put(name[i], yearning[i]);
        }
        for (int i=0; i<photo.length; i++){
            String[] persons = photo[i];
            int score = 0;
            for(int j=0; j<persons.length; j++){
                String person = persons[j];
                if(photos.containsKey(person)){
                    score += photos.get(person);
                }
                
            }
            answer[i] = score;
        }
        return answer;
    }
}
