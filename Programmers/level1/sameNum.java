package level1;
import java.util.ArrayList;
import java.util.Arrays;

public class sameNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,1,3,3,0,1,1};
		
		Solution8 s = new Solution8();
		s.solution(arr);
	}

}

class Solution8 {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        ArrayList<Integer> list= new ArrayList<>();
        
        for(int i=0; i<arr.length; i++) {
        	if(i>0&&(arr[i-1]==arr[i])) {
        		continue;
        	}
        	else {
        		list.add(arr[i]);
        	}
        }
        
        
        answer = new int[list.size()];
        for(int i =0; i<answer.length; i++) {
        	answer[i]=list.get(i);
        }
        
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}