class Solution {
    public boolean solution(String s) {
        int length = s.length();
        
        if (length != 4 && length != 6) {
            return false;
        }
        
        if (!s.matches("\\d+")) {
            return false;
        }
         
        return true;
    }
}
