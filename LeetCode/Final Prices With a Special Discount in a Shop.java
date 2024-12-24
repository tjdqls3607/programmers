class Solution {
    public int[] finalPrices(int[] prices) {
        int[] output = new int[prices.length];

        for (int i=0; i<prices.length; i++) {
            output[i] = prices[i];   //할인이 없는 경우
            for (int j=i+1; j<prices.length; j++) {
                if (prices[j]<=prices[i]){  //뒤의 인덱스가 할인을 만족하면 
                    output[i] = prices[i] - prices[j];
                    break;
                }
            }
        }
        return output;
    }
}
