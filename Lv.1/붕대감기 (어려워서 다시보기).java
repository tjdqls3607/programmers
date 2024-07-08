class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int t = bandage[0]; //붕대감기 시전시간
        int x = bandage[1]; //1초당 회복량
        int y = bandage[2]; //연속 성공시 추가 회복량
        
        int currentHealth = health;
        int successTime = 0; //연속 성공 시간
        int attackIndex = 0; //공격배열의 인덱스
        int attackCount = attacks.length; //공격 횟수
        
        for (int time=0; time<=attacks[attackCount -1][0]; time++) {    //공격시간시 체력감소
            if(attackIndex < attackCount && attacks[attackIndex][0] == time) {
                currentHealth -= attacks[attackIndex][1];
                attackIndex++;
                successTime = 0;    //공격받으면 성공시간 초기화
                
                if (currentHealth <= 0 ) {
                    return -1; //체력이 0이하가 되면 -1반환
                }
                }else { //공격을 받지 않은 경우 체력 회복
                    currentHealth = Math.min(currentHealth + x, health);
                    successTime++;
                    
                    if (successTime == t) {
                        currentHealth = Math.min(currentHealth + y, health);
                        successTime = 0; //성공 시 초기화
                    }
                }
            }
        return currentHealth;
        }
}
