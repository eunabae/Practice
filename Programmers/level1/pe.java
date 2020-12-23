package level1;
import java.util.HashMap;

public class pe {

	public static void main(String[] args) {
		int n=7; // 전체 학생 수
		int[] lost= {1,3,5}; // 도난
		int[] reserve= {2,3,6}; // 여분
		
		Solution4 s = new Solution4();
		s.solution(n, lost, reserve);
				
	}

}

class Solution4 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i=1; i<n+1; i++) {
        	hm.put(i, 1);
        	for(int j=0; j<reserve.length; j++) {
            	if(i==reserve[j])
            		hm.put(i, 2);
            }
        	for(int k=0; k<lost.length; k++) {
        		if(i==lost[k])
        			hm.put(i, hm.get(i)-1);
        	}
        }
       
        //System.out.println(hm.toString());
        //한쪽만 빌릴 수 있는 사람 먼저.
        
        for(int i=1; i<n+1; i++) {
        	if(i==1) {
        		if(hm.get(i)==0&&hm.get(i+1)==2) {
        			hm.put(i, 1);
        			hm.put(i+1, 1);
        		} 
        	}
        	else if(i==n) {
        		if(hm.get(i)==0&&hm.get(i-1)==2) {
        			hm.put(i, 1);
        			hm.put(i-1, 1);
        		}
        	}
        	else {
        		if(hm.get(i)==0) {
        			if(hm.get(i+1)==0&&hm.get(i-1)==2) {
        				hm.put(i,1);
        				hm.put(i-1, 1);
        			}
        			else if(hm.get(i+1)==2&&hm.get(i-1)==0) {
        				hm.put(i,1);
        				hm.put(i+1, 1);
        			}
        		}
        	}
        }
        
        for(int i=1 ; i<n+1; i++) {
        	if(hm.get(i)==0&&(i+1<n+1)&&(i-1>0)) {
        		if(hm.get(i+1)==2) {hm.put(i+1, 1); hm.put(i, 1);}
        		else if(hm.get(i-1)==2) {hm.put(i-1, 1); hm.put(i, 1);}
        	}
        	
        }
        
        for(int i=1; i<n+1; i++) {
        	if(hm.get(i)>0) answer++;
        }        
                
        System.out.println(answer);
        return answer;
    }
}