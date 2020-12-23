package level2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class funcdev {

	public static void main(String[] args) {

		int[] progresses = {93, 30, 55};
		int[] speeds = {1, 30, 5};
		
		Solution4 s= new Solution4();
		s.solution(progresses, speeds);
	}

}
//
//class Solution4 {
//    public int[] solution(int[] progresses, int[] speeds) {
//        int[] answer = {};
//        int count = 0;
//        
//        Queue<product> queue = new LinkedList<>();
//        Stack<Integer> stack = new Stack();
//        LinkedList<Integer> list = new LinkedList();
//        
//        for(int i=0; i<progresses.length; i++) {
//        	queue.offer(new product(progresses[i],speeds[i]));
//        }
//        
//       while(!queue.isEmpty()) {
//    	   
//        	int tempS = queue.peek().speed;
//        	int tempP = queue.peek().process;
//   
//        	queue.poll();
//        	
//        	if(tempP+tempS<100) {
//        		queue.offer(new product(tempP+tempS, tempS));
//        	}
//        	else {
//        		stack.push(count%progresses.length);
//        	}
//    	   	count++;
//       }
//       
//       count=1;
//       int index=0;
//       
//       for(int i = 0; i<stack.size(); i++) {
//    	   int temp = stack.pop();
//    	   if(temp == stack.peek()) {
//    		   count++;
//    	   }
//    	   else {
//    		   count=1;
//    		   index++;
//    	   }
//       }
//       
//       
//       System.out.println(list.toString());
//        return answer;
//    }
//}
//
//class product {
//	int process;
//	int speed;
//	
//	public product(int process, int speed) {
//		this.process = process;
//		this.speed = speed;
//	}
//}