import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder builder = new StringBuilder();
    
        int index = 0;
        for(String str : s.split("")) {
            if(str.equals(" ")) {
                index = 0;
                builder.append(" ");
                continue;
        }
            if(index % 2 == 0) {
                builder.append(str.toUpperCase());
            } else {
                builder.append(str.toLowerCase());
            }
            index++;
        }
    return builder.toString();
    }
}
