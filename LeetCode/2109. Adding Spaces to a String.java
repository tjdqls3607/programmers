class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder result = new StringBuilder();
        int spaceIndex = 0;
        
        // 현재 인덱스를 추적할 변수
        int currentIndex = 0;
        
        // spaces 배열을 순차적으로 탐색하면서 해당 위치에 공백을 추가
        for (int i = 0; i < s.length(); i++) {
            // spaces 배열에서 현재 인덱스에 공백을 넣어야 한다면
            if (spaceIndex < spaces.length && i == spaces[spaceIndex]) {
                result.append(' ');  // 공백 추가
                spaceIndex++;  // 다음 공백 인덱스로 이동
            }
            
            result.append(s.charAt(i));  // 현재 문자를 결과에 추가
        }
        
        return result.toString();
    }
}

/*
  StringBuilder 사용:
	•	StringBuilder result = new StringBuilder(); : 문자열을 효율적으로 수정하기 위해 StringBuilder를 사용합니다. 
  (일반적인 문자열은 불변이라 매번 새로운 문자열을 생성해야 하는데, StringBuilder는 변경이 가능하여 더 효율적입니다.)

  spaceIndex:
	•	spaceIndex는 spaces 배열을 추적하는 변수입니다. 이 변수는 공백을 삽입할 인덱스를 관리합니다.
	•	예를 들어, spaces = [4, 8, 12, 16]이면 spaceIndex는 4, 8, 12, 16 인덱스를 순차적으로 확인하면서 공백을 추가합니다.

  문자열 순차 처리:
	•	for (int i = 0; i < s.length(); i++) { ... } : 문자열 s의 각 문자에 대해 반복문을 실행합니다.
	
  •	공백 추가:
	•	if (spaceIndex < spaces.length && i == spaces[spaceIndex]) : 현재 인덱스 i가 spaces 배열의 현재 인덱스와 일치하면 공백을 추가합니다.
	•	result.append(' '); : 공백을 추가합니다.
	•	spaceIndex++ : 공백을 추가했으므로, spaceIndex를 증가시켜서 다음 공백을 추가할 위치로 이동합니다.
	
  •	문자 추가:
	•	result.append(s.charAt(i)); : 현재 문자(s.charAt(i))를 StringBuilder에 추가합니다.

  결과 반환:
	•	return result.toString(); : StringBuilder에 저장된 결과를 최종적으로 문자열로 변환하여 반환합니다.
*/
