package level1;
import java.util.HashMap;

public class runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		Solution2 s = new Solution2();
		s.solution(participant, completion);
	}

}


class Solution2 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        
        for(String p : participant) {
        	if(hm.containsKey(p)) {
        		hm.put(p, hm.get(p)+1);
        	}
        	else hm.put(p, 1);
        }
        
        for(String c:completion) {
        	if(hm.containsKey(c)) {
        		hm.replace(c, hm.get(c)-1);
        	}
        }

        for(String p : participant) {
        	if(hm.get(p)==1) {
        		answer=p;
        		break;
        	}
        }
        System.out.println(answer);
        return answer;
    }
}