class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < s.length(); j += ((numRows - 1) * 2)) {
                sb.append(s.charAt(j));
                
                if (i > 0 && i < numRows - 1 && (j + ((numRows - 1) * 2) - 2 * i) < s.length()) {
                    sb.append(s.charAt((j + ((numRows - 1) * 2) - (2 * i))));
                }
            }
        }
        return sb.toString();
    }
}