package level1;

public class dayOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=5;
		int b=24;
		
		Solution6 s= new Solution6();
		s.solution(a, b);
	}

}


class Solution6 {
    public String solution(int a, int b) {
        String answer = "";

        // ���� -2�� 29�� // 1�� 1���� �ݿ���
        //SUN,MON,TUE,WED,THU,FRI,SAT
        String[] dow = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        int[] day = {31,29,31,30,31,30,31,31,30,31,30,31};
        
        int days=0;
        
        for(int i=0; i<a-1; i++) {
        	days+=day[i];
        }
        
        days+=b;
        days%=7;
        
        answer = dow[days];
        System.out.println(answer);
        return answer;
    }

}


