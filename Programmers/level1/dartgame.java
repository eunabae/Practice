package level1;
import java.util.Arrays;

public class dartgame {

	public static void main(String[] args) {
		String dartResult="1D2S0T";
		Solution14 s = new Solution14();
		
		s.solution(dartResult);
	}

}

class Solution14 {
    public int solution(String dartResult) {
        int answer = 0;
        
        char[][] num =new char[3][3];
        int count=0;
        int dart=0;
        int[] numbers = new int[3];
        
        for(int i=0; i<dartResult.length() ; i++) {
        	if(dartResult.charAt(i)=='1'&&dartResult.charAt(i+1)=='0') {
        		num[dart][count]=10+48; //char 1 == int 49 => 48Â÷
        		count++;
        		i++;
        	}
        	
        	else {
        		num[dart][count] = dartResult.charAt(i);
            	count++;	
        	} 
        	
        	if(i+1<dartResult.length()) {
        		if(dartResult.charAt(i+1)>='0'&&dartResult.charAt(i+1)<='9') {
        			dart++;
        			count=0;
        		}
        	}
        }
        
        System.out.println(Arrays.toString(num[0]));
        System.out.println(Arrays.toString(num[1]));
        System.out.println(Arrays.toString(num[2]));
        
        for(int i=0; i<numbers.length; i++) {
        	int a = num[i][0]-48; //char 1 == int 49
        	int b = changeNum(num[i][1]);
        	
        	numbers[i]=(int) Math.pow(a,b);
        	
        	if(num[i][2]=='*') {
        		if(i==0) {
        			numbers[i]=numbers[i]*2;
        		}
        		else {
        			numbers[i]=numbers[i]*2;
        			numbers[i-1]=numbers[i-1]*2;
        		}
        	}
        	else if(num[i][2]=='#') {
        		numbers[i]=numbers[i]*(-1);

        	}
        }
        
        for(int i=0 ;i<numbers.length; i++) {
        	answer+=numbers[i];
       }

        //System.out.println(Arrays.toString(numbers));
        System.out.println(answer);
        return answer;
    }

    public int changeNum(char c) {
    	switch (c) {
		case 'S':return 1;
		case 'D':return 2;
		case 'T':return 3;
		default: return 0;
		}
    }
}