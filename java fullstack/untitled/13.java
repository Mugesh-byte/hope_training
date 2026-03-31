import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
       
        Map<Character, Integer> rome = new HashMap<>();
        rome.put('I', 1);
        rome.put('V', 5);
        rome.put('X', 10);
        rome.put('L', 50);
        rome.put('C', 100);
        rome.put('D', 500);
        rome.put('M', 1000);

        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            int currentVal = rome.get(s.charAt(i));
            
           
            if (i > 0 && currentVal > rome.get(s.charAt(i - 1))) {
                
                n += currentVal - (2 * rome.get(s.charAt(i - 1)));
            } else {
                n += currentVal;
            }
        }
        
        return n;
    }
}