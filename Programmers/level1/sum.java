package level1;

public class sum {

	public static void main(String[] args) {

		int a=3;
		int b=3;
		
		Solution10 s= new Solution10();
		s.solution(a, b);
	}

}

class Solution10 {
    public long solution(int a, int b) {
        long answer = 0;
        
        int x=Math.min(a, b);
        int y=Math.max(a, b);
        
        for(int i=x; i<y+1; i++) {
        	answer+=i;
        }

        System.out.println(answer);
        
        return answer;
    }
}