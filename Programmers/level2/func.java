package level2;

import java.util.ArrayList;
import java.util.Stack;

public class func {

	public static void main(String[] args) {

		int[] progresses = {93, 30, 55};
		int[] speeds = {1, 30, 5};
		
		Solution4 s= new Solution4();
		s.solution(progresses, speeds);
	}

}


class Solution4 {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};        
       
        ArrayList<Integer[]> temp = new ArrayList();
        ArrayList<Integer> list = new ArrayList();
        Stack<Integer[]> stack = new Stack();
        
        int count =0;
        
        for(int i =progresses.length-1; i>=0; i--) {
        	Integer[] integer = {progresses[i]+speeds[i], speeds[i]};
        	stack.push(integer);
        }
        
        for(int i =0; i<progresses.length;) {
        	while (!stack.isEmpty() && stack.peek()[0] >= 100) {
        		i++;
        		count++;
        		stack.pop();
            }
        	
        	list.add(count);
        	
        	while(!stack.isEmpty()) {
        		temp.add(stack.pop());
        	}
        	
        	 for(int j =temp.size()-1; j>=0; j--) {
             	stack.push(temp.get(j));
             }
        	
        }
        return answer;
    }
}