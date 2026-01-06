class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> a[1] - b[1]);
        int n = intervals.length;
        int i = 0;
        int j = 1;
        int count = 0;
        while(j<n){
            if(intervals[i][1]>intervals[j][0]){
                count++;
                j++;
            }
            else{
                i = j;
                j++;
            }
        }
        return count;
    }
}