package level1;
import java.util.Arrays;

public class map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		int[] arr1= {9, 20, 28, 18, 11};
		int[] arr2= {30, 1, 21, 17, 28};
		
		Solution12 s = new Solution12();
		s.solution(n, arr1, arr2);
	}

}

class Solution12 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        
        answer=new String[n];
        int[] t1 = new int[n];
        int[] t2= new int[n];
        		
        for(int i=0; i<n; i++) {
        	t1=makebit(n, arr1[i]);
        	t2=makebit(n, arr2[i]);
            String temp="";

        	for(int j=0; j<n; j++) {
        		if(t1[j]==0&&t2[j]==0) {
        			temp+=" ";
        		}
        		else {temp+="#";}
        	}
        	answer[i]=temp;
        }
        
        
        System.out.println(Arrays.toString(answer));
        
        return answer;
    }
    
    public int[] makebit(int n, int a) {
    	
    	int[] bit=new int[n];
    	
    	for(int i=n-1; i>-1; i--) {
    		bit[i]=a%2;
    		a=a>>1;
    	}
    	
    	return bit;
    }
}