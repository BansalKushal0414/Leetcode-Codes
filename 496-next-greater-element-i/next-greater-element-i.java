class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int res[] = new int[nums1.length];
        int m = nums1.length;
        int n = nums2.length;

        // res[m-1] = -1;
        for(int i = m-1; i>=0;i--){
            Stack<Integer> st = new Stack<>();
            int j = n-1;

            while(nums1[i] != nums2[j]){
                st.add(j);
                j--;
            }

            while(!st.isEmpty() && nums2[st.peek()] < nums1[i]){
                st.pop();
            }

            if(st.isEmpty()){
                res[i] = -1;
            }
            else{
                res[i] = nums2[st.peek()];
            }
        }
        return res;
    }
}