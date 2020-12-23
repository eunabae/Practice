package level1;

public class failRate {

	public static void main(String[] args) {

		int N=4;
		int[] stages= {4,4,4,4,4};
		
		Solution13 s= new Solution13();
		s.solution(N, stages);
	}

}

class Solution13 {
    public int[] solution(int N, int[] stages) {
        int[] answer = {};
        answer=new int[N];        
       
        Pair[] p = new Pair[N];
        Pair temp = new Pair();
        
        for(int i=0; i<p.length; i++) {
        	p[i]=new Pair(i+1,rate(i+1, stages));
        }
        
        for(int i=0; i<N-1; i++) {
        	for(int j=i+1; j<N; j++) {
        		if(p[i].fail<p[j].fail) {
        			temp=p[i];
        			p[i]=p[j];
        			p[j]=temp;
        		}
        		else if(p[i].fail==p[j].fail&&p[i].stage>p[j].stage) {
        			temp=p[i];
        			p[i]=p[j];
        			p[j]=temp;
        		}
        	}
        }
        
        for (int i = 0; i < p.length; i++) {
            answer[i]=p[i].stage;
        }
       
   		return answer;
    }
    
    public double rate (int n, int[] stages) {
    	int stay=0;
    	int fail=0;
    	
    	for(int i=0; i<stages.length; i++) {    		
    		if(stages[i]>=n) {stay++;}
    		if(stages[i]==n) {fail++;}
    	}  	
    	if(stay==0) {return 0;}
    	
    	return (double)fail/stay;
    }
    
}

class Pair{
	int stage;
	double fail;
	
	public Pair() {
		this.stage=0;
		this.fail=0;
	}
	
	public Pair(int stage, double fail) {
		this.stage=stage;
		this.fail=fail;
	}
	
	public int getS(double fail) {
		return stage;
	}
	
	public double getf(int stage) {
		return fail;
	}
	
}