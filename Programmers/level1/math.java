package level1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] answers = {1,2,3,4,5};
		int[] answers = {1,3,2,4,2};
		
		Solution3 s = new Solution3();
		s.solution(answers);
		
	}

}


class Solution3 {
    public int[] solution(int[] answers) {
        int[] answer = {};
        
        int[] counter = new int[3];
        
        int[] a1 = {1,2,3,4,5};
        int[] a2 = {2,1,2,3,2,4,2,5};
        int[] a3 = {3,3,1,1,2,2,4,4,5,5};
        
        
        for(int i=0; i<answers.length; i++) {
        	if(answers[i]==a1[i%5]) {
        		counter[0]++;
        	}
        	if(answers[i]==a2[i%8]) {
        		counter[1]++;
        	}
        	if(answers[i]==a3[i%10]) {
        		counter[2]++;
        	}
        }
       
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(1, counter[0]);
        hm.put(2, counter[1]);
        hm.put(3, counter[2]);
        
        Arrays.sort(counter);
        
        ArrayList<Integer> list = new ArrayList<>();
        
        if(counter[2]==hm.get(1)) {
        	list.add(1);
        }
        
        if(counter[2]==hm.get(2)) {
        	list.add(2);
        }
        
        if(counter[2]==hm.get(3)) {
        	list.add(3);
        }
        
        answer=new int[list.size()];
        
        for(int i=0; i<list.size(); i++) {
        	answer[i]=list.get(i);
        }
        
        //System.out.println(Arrays.toString(answer));
        
        return answer;
    }
}
