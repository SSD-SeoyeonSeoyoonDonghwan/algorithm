import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings);
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                char first = o1.charAt(n);
                char second = o2.charAt(n);
                return first - second;
            }
        });
        
        return strings;
    }
}
