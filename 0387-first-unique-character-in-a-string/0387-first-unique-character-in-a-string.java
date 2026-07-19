import java.util.HashMap;
import java.util.Map;

class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();
        if (n == 1) {
            return 0;
        }

        if (!s.substring(1).contains(s.substring(0, 1))) {

            return 0;
        }
        for (int i = 1; i < n - 1; i++) {
            if (!s.substring(0, i).contains(s.substring(i, i + 1))
                    && !s.substring(i + 1).contains(s.substring(i, i + 1))) {

                return i;
            }
        }
        if (!s.substring(0, n - 1).contains(s.substring(n - 1)))
            return n - 1;
        
        return -1;
    }
}