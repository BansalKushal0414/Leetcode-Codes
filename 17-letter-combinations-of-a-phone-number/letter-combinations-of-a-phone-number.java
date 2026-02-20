class Solution {

    public void combinations(List<String> ans, String[] val, String res, String digits, int string_len){
        // if(string_len >= digits.length() -1){
        //     return;
        // }
        if(res.length() == digits.length()){
            ans.add(res);
            return;
        }
        String letters = val[digits.charAt(string_len) - '2'];
        for(char ch : letters.toCharArray()){
            combinations(ans,val,res+ch,digits,string_len+1);
        }
        
    }

    public List<String> letterCombinations(String digits) {
        String[] phone_map = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        int len = digits.length();
        List<String> ans = new ArrayList<>();
        if(len == 0) return ans;
        combinations(ans, phone_map, "", digits,0);
        return ans;
    }
}