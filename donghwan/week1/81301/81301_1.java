import java.util.*;

class Solution {
    private String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    
    public int solution(String s) {
        StringBuilder answer = new StringBuilder();
        
        int index = 0;
        for(int i=0; i<s.length(); i++) {
            if(Character.isDigit(s.charAt(i))) {
                answer.append(s.charAt(i));
                index++;
                continue;
            }
            
            String target = s.substring(index, i + 1);
            int num = convertNumber(target);
            if(num != -1) {
                answer.append(num);
                index = i + 1;
            }
        }
        
        return Integer.parseInt(answer.toString());
    }
    
    private int convertNumber(String str) {
        for(int i=0; i<words.length; i++) {
            if(words[i].equals(str)) {
                return i;
            }
        }
        
        return -1;
    }
}
