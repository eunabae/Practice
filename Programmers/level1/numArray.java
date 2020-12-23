package level1;
import java.util.ArrayList;
import java.util.Arrays;

public class numArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {3,2,6};
		int divisor=10;
		
		Solution9 s= new Solution9();
		s.solution(arr, divisor);
		
	}
}


class Solution9 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++) {
        	if(arr[i]%divisor==0) {
        		list.add(arr[i]);
        	}
        }
        
        
        if(list.size()==0) {
        	answer= new int[1];
        	answer[0]=-1;
        }
        else {
        	answer=new int[list.size()];
        
        	for(int i=0; i<list.size(); i++) {
        		answer[i]=list.get(i);
        	}
        
        	Arrays.sort(answer);
        }
        
        System.out.println(Arrays.toString(answer));
        
        return answer;
    }
}