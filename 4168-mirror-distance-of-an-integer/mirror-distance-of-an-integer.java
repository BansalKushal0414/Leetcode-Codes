class Solution {
    public int reverseNumber(int n){
        int res = 0;
        while(n > 0){
            int temp = n % 10;
            res = res * 10 + temp;
            n = n / 10;
        }
        System.out.print(res);
        return res;
    }
    public int mirrorDistance(int n) {
        int nReversed = reverseNumber(n);
        return Math.abs(n - nReversed);
    }
}