package level1;
import java.util.ArrayList;
import java.util.Collections;

public class knum {

	public static void main(String[] args) {
		int[] array= {1, 5, 2, 6, 3, 7, 4};
		int[][]commands= {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		Solution5 s = new Solution5();
		s.solution(array, commands);
	}

}

class Solution5 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        answer = new int[commands.length];
        
        for(int i=0; i<commands.length; i++) {
        	ArrayList<Integer> temp = new ArrayList<>();
        	
        	for(int j=commands[i][0]-1; j<commands[i][1]; j++) {
        		temp.add(array[j]);
        	}
        	
        	//System.out.println(temp);
        	Collections.sort(temp);
        	answer[i]=temp.get(commands[i][2]-1);
        }
  
        return answer;
    }
}
