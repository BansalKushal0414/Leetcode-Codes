class Solution {

    public int[] nextSmallest(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int res[] = new int[n];
        res[n-1] = n;
        st.push(n-1);

        for(int i = n-2; i>=0; i--){
            while(st.size() > 0 && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            if(st.size() == 0){
                res[i] = n;
            }
            else{
                res[i] = st.peek();
            }
            st.push(i);
        }

        return res;
    }

    public int[] prevSmallest(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] res = new int[n];
        res[0] = -1;
        st.push(0);
        for(int i = 1;i<n;i++){
            while(st.size() > 0 && arr[st.peek()] > arr[i]){
                st.pop();
            }
            if(st.size() == 0){
                res[i] = -1;
            }
            else{
                res[i] = st.peek();
            }
            st.push(i);
        }
        return res;
    }

    public int sumSubarrayMins(int[] arr) {
        int[] nextS = nextSmallest(arr);
        int[] prevS = prevSmallest(arr);

        long sum = 0;
        long MOD = 1_000_000_007;

        for(int i = 0; i < arr.length; i++){
            long left = i - prevS[i];
            long right = nextS[i] - i;
            long total = (left * right) % MOD * arr[i] % MOD;
            sum = (sum + total) % MOD;
        }
        return (int)sum;
    }
}