package level2;

import java.util.Arrays;

public class stock {

	public static void main(String[] args) {

		int[] prices= {1, 2, 3, 2, 3};
		Solution2 s = new Solution2();
		s.solution(prices);
	}

}

class Solution2 {
    public int[] solution(int[] prices) {
        int[] answer = {};
        
        answer = new int[prices.length];
        
        for(int i =0 ;  i<prices.length; i++) {
        	int count=0;
        	for(int j=i+1 ; j<prices.length; j++) {
        		count++;
        		if(prices[i]>prices[j]) {
        			break;
        		}
        	}
        	
        	answer[i]=count;
        }
        
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}