class Solution {
    public String decodeString(String s) {
        java.util.Stack<Integer> counts = new java.util.Stack<>();
        java.util.Stack<String> resultStack = new java.util.Stack<>();
        String result = "";
        int index = 0;
        while (index < s.length()) {
            char c = s.charAt(index);
            if (Character.isDigit(c)) {
                int num = 0;
                while (Character.isDigit(s.charAt(index))) {
                    num = num * 10 + (s.charAt(index) - '0');
                    index++;
                }
                counts.push(num);
            } else if (c == '[') {
                resultStack.push(result);
                result = "";
                index++;
            } else if (c == ']') {
                String temp = resultStack.pop();
                int count = counts.pop();
                StringBuilder sb = new StringBuilder(temp);
                for (int i = 0; i < count; i++) sb.append(result);
                result = sb.toString();
                index++;
            } else {
                result += c;
                index++;
            }
        }
        return result;
    }
}