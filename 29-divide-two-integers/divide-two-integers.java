class Solution {
    public int divide(int dividend, int divisor) {
        int ans = 0;
        boolean neg = false;

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        if((dividend < 0 && divisor > 0) || dividend > 0 && divisor < 0){
            neg = true;
        }

        if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)) {
            neg = true;
        }

        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);

        while(dvd >= dvs){
            long prev = dvs;
            int pwr = 1;
            
            while((prev<<1) <= dvd){
                prev = prev << 1;
                pwr = pwr << 1;
            }

            dvd -= prev;
            ans+=pwr;
        }
        return (neg == true) ? -ans : ans;
    }
}