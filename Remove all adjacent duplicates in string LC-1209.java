class Solution {
    public String removeDuplicates(String s, int k) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> counts = new Stack<>();
        for (char c : s.toCharArray()) {
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == c) {
                int cnt = counts.pop() + 1;
                if (cnt == k) sb.delete(sb.length() - k + 1, sb.length());
                else {
                    counts.push(cnt);
                    sb.append(c);
                }
            } else {
                sb.append(c);
                counts.push(1);
            }
        }
        return sb.toString();
    }
}