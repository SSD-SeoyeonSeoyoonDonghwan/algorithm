import java.util.*;
import java.util.stream.*;

class Solution {
    
    public int[] solution(int[] lottos, int[] win_nums) {
        List<Integer> numbers = Arrays.stream(win_nums)
                .boxed()
                .collect(Collectors.toList());
        int[] count = getRange(lottos, numbers);
        int max = this.getRank(count[1]);
        int min = this.getRank(count[0]);
        
        return new int[]{max, min};
    }
    
    private int[] getRange(int[] lottos, List<Integer> numbers) {
        int zeroCnt = 0;
        int matchCnt = 0;
        for(int lotto : lottos) {
            if (lotto == 0) {
                zeroCnt++;
                continue;
            }
            
            if (numbers.contains(lotto)) {
                matchCnt++;
                continue;
            }
        }
        
        return new int[]{matchCnt, matchCnt + zeroCnt};
    }
    
    private int getRank(int cnt) {
        if (cnt < 2) return 6;
        
        int rank = Math.abs(cnt - 6) + 1;
        return rank;
    }
}
