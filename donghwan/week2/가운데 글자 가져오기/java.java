class Solution {
    public String solution(String s) {
        int length = s.length();
        int value = length / 2;
        if(length % 2 == 0) {
            return s.substring(value-1, value+1);
        } else {
            return s.substring(value, value+1);
        }
    }
}
