package level2;

public class num124 {

	public static void main(String[] args) {
		int n = 10;
		
		Solution3 s = new Solution3();
		s.solution(n);
	}

}


class Solution3 {
    public String solution(int n) {
        String answer = "";
        String s="";
        
        while(true) {
        	n=n-1;
        	s = select(n%3);
        	
        	answer = s+answer;
        	
        	if(n/3>0) {
        		n=n/3;
        	}
        	
        	else{break;}
        }
        
        System.out.println(answer);
        return answer;
    }

    public String select(int n) {
    	switch (n) {
		case 0: return "1";
		case 1: return "2"; 
		case 2: return "4"; 
		default: return "0";
    	}
    }
}