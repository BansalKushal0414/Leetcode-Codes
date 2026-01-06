class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,(a,b)-> a[1] - b[1]);
        int n = pairs.length;
        int i = 0;
        int j = 1;
        int count = 1;
        while(j<n){
            if(pairs[i][1]<pairs[j][0]){
                count++;
                i = j;
                j++;
            }
            else j++;
        }
        return count;
    }
}