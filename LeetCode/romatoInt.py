class Solution:
    def romanToInt(self, s: str) -> int:
        # 결과 값을 저장할 변수 초기화
        sum = 0

        # 로마 숫자와 정수 값 매핑
        roman = {
            'I' : 1,    # 1
            'V' : 5,    # 5
            'X' : 10,   # 10
            'L' : 50,   # 50
            'C' : 100,  # 100
            'D' : 500,  # 500
            'M' : 1000  # 1000
        }

        # 문자열을 인접한 문자 쌍으로 순회
        for a, b in zip(s, s[1:]):
            # 앞 문자가 뒷 문자보다 작으면 빼기 (예: IV -> 4)
            if roman[a] < roman[b]:
                sum -= roman[a]
            else:
                # 그렇지 않으면 더하기
                sum += roman[a]

        # 마지막 문자의 값을 더하기 (마지막 문자는 비교되지 않음)
        return sum + roman[s[-1]]
