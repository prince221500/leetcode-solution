import java.util.*;

class Solution {

    public static int romanToInt(String nums) {
      
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int t = 0;
        int p = 0;

        
        for (int i = nums.length() - 1; i >= 0; i--) {
            char currentChar = nums.charAt(i);
            int c = romanMap.get(currentChar);

           
            if (c < p) {
                t -= c;
            } else {
                
                t += c;
            }

            p = c;
        }

        return t;
    }

   
    }
