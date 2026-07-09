class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        
        int[] res = new int[m];
        HashMap<Integer,Integer> hm = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        for(int j = n-1; j >=0; j--){
            while(!st.isEmpty() && nums2[j] > st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                hm.put(nums2[j], -1);
            }
            else{
                hm.put(nums2[j],st.peek());
            }
            st.push(nums2[j]);
        }

        for(int i = 0; i<m; i++){
            res[i] = hm.get(nums1[i]);
        }
        return res;
    }
}