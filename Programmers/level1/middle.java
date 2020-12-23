package level1;

public class middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcde";
		
		Solution7 s= new Solution7();
		s.solution(str);
	}

}

class Solution7 {
    public String solution(String s) {
        String answer = "";
        
        int len=s.length();
        int index = len/2;
        
        if(len%2==0) {
        	answer=s.substring(index-1, index+1);
        }
        else {
        	answer=s.substring(index,index+1);	
        }
        
        System.out.println(answer);
        return answer;
    }
}
