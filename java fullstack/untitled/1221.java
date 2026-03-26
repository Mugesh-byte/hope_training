class Solution {
    public int balancedStringSplit(String s) {
        int balancedCount = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current == 'R') {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                balancedCount++;
            }
        }
        return balancedCount;
    }
}