class Solution {
    private String[] week = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
    private int[] MONTH_COUNT = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    public String solution(int month, int day) {
        int dayCount = calculate(month, day) % 7;
        return week[dayCount];
    }
    
    private int calculate(int month, int day) {
        int total = -1;

        int startMonth = 1;
        while(startMonth < month) {
            total += MONTH_COUNT[startMonth++];
        }
        
        total += day;
        return total;
    }
}
