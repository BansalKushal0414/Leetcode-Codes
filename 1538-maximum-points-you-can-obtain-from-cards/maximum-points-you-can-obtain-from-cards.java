class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int totalSum = 0;

        for(int i = 0;i < k; i++){
            totalSum += cardPoints[i];
        }

        int maxSum = totalSum;

        for(int i = 0; i<k; i++){
            totalSum-=cardPoints[k-1-i];

            totalSum+=cardPoints[n-1-i];

            maxSum = Math.max(maxSum,totalSum);
        }
        return maxSum;
    }
}