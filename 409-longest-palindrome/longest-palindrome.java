class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> freq = new HashMap<>();
        int total = 0;
        boolean oneExists = false;

        for(int i = 0;i<s.length();i++){
            freq.put(s.charAt(i),freq.getOrDefault(s.charAt(i),0)+1);
        }

        for(Map.Entry<Character,Integer> mp : freq.entrySet()){
            if(mp.getValue() % 2 == 0){
                total += mp.getValue();
            }
            else{
                oneExists = true;
                if(mp.getValue() > 1){
                    total += mp.getValue() - 1;
                }
            }
        }
        return (oneExists) ? total+1 : total;
    }
}