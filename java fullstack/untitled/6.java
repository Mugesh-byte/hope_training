class Solution {
    public String convert(String s, int numRows) {
       
        if (numRows <= 1 || s.length() <= numRows) {
            return s;
        }
        StringBuilder zz = new StringBuilder();
        int n = s.length();
        int step = 2 * numRows - 2;
        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < n; j += step) {
                zz.append(s.charAt(j));
                if (i > 0 && i < numRows - 1) {
                    int diagonalIndex = j + step - 2 * i;
                    if (diagonalIndex < n) {
                        zz.append(s.charAt(diagonalIndex));
                    }
                }
            }
        }
        return zz.toString();
    }
}
