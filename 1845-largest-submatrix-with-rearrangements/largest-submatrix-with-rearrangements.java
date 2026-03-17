class Solution {
    public int largestSubmatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int maxArea = 0;

        // For column

        for(int i = 0;i<m;i++){
            for(int j = 0; j < n; j++){
                if(j!=0 && matrix[j][i] == 1){
                    matrix[j][i] = 1 + matrix[j-1][i];
                }
            }
        }

        //  For row

        for(int i = 0; i<n ;i++){
            Arrays.sort(matrix[i]);
            for(int j = 0; j < m; j++){
                int height = matrix[i][j];
                int width = m - j;

                int area = height * width;
                // update max area
                maxArea = Math.max(maxArea,area);
            }
        }

        // System.out.println(Arrays.deepToString(matrix));
        return maxArea;
    }
}