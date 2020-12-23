package level2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class printer {

	public static void main(String[] args) {
		
		int[] priorities = {1, 1, 9, 1, 1, 1};
		int location =0;
		
		Solution1 s = new Solution1();
		s.solution(priorities, location);
	}

}

class Solution1 {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        Queue<Print> q = new LinkedList();
        
        System.out.println("초기: "+Arrays.toString(priorities));
        for(int i=0 ; i<priorities.length ; i++) {
        	Print p = new Print(i,priorities[i]);
        	q.offer(p);
        }
       
       int count = 0;
       while(true){
        	int check = 0;
        	
        	for(int i=0; i<priorities.length ; i++) {
        		if(q.peek().priority<priorities[i]) {
        			q.offer(q.peek());
        			q.poll();
        			check = 1;
        			break;
        		}
        	}
        	        	
        	if(check==0) {
        		Print temp = q.poll();
        		check = temp.printer;
        		priorities[check]=-1;
            	count++;
            	System.out.println("출력 횟수: "+count+"// 출력 위치: " + temp.printer + "// 우선순위 배열 : "+Arrays.toString(priorities));
        		if(temp.printer==location) {
        			answer=count;
        			break;
        		}
        	}
        }

        System.out.println(answer);
        return answer;
    }
    
}

class Print{
	int priority;
	int printer;

	public Print() {
	}

	public Print(int printer, int priority) {
		this.printer = printer;
		this.priority= priority;
	}
}