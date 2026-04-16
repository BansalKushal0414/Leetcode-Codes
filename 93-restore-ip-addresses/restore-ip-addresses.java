class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        backtrack(s, 0, 0, new ArrayList<>(), res);
        return res;
    }

    private void backtrack(String s, int index, int parts, List<String> path, List<String> res) {
        if (parts == 4 && index == s.length()) {
            res.add(String.join(".", path));
            return;
        }

        if (parts == 4 || index == s.length()) return;

        for (int len = 1; len <= 3; len++) {
            if (index + len > s.length()) break;

            String segment = s.substring(index, index + len);

            if ((segment.length() > 1 && segment.charAt(0) == '0') || Integer.parseInt(segment) > 255) continue;

            path.add(segment);
            backtrack(s, index + len, parts + 1, path, res);
            path.remove(path.size() - 1);
        }
    }
}