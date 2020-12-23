package level1;

public class keypad {

	public static void main(String[] args) {

		int[] numbers= {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
		String hand="left";
		
		Solution11 s= new Solution11();
		s.solution(numbers, hand);
		
	}

}


class Solution11 {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
        int[] left = {3,0};
        int[] right = {3,2};
        
        for(int i=0; i<numbers.length; i++) {
        	
        	switch (numbers[i]%3) {
			case 0:
				if(numbers[i]==0) {
					int leftLen = Math.abs(left[0]-3)+Math.abs(left[1]-1);
					int rightLen= Math.abs(right[0]-3)+Math.abs(right[1]-1);
					
					if(leftLen<rightLen) {
						answer+="L";
						left = move(left, 3, 1);
					}
					else if(leftLen>rightLen) {
						answer+="R";
						right = move(right,3,1);
					}
					else {
						if(hand.equals("left")) {
							answer+="L";
							left = move(left, 3, 1);
						}
						else {
							answer+="R";
							right = move(right,3,1);
						}
					}
				}
				
				else {
					answer+="R";
					right = move(right, (numbers[i]/3)-1, 2);
				}
				
				break;
				
			case 1:
				answer+="L";
				left = move(left, (numbers[i]/3), 0);
				break;
			
			case 2:
				int leftLen = Math.abs(left[0]-(numbers[i]/3))+Math.abs(left[1]-1);
				int rightLen= Math.abs(right[0]-(numbers[i]/3))+Math.abs(right[1]-1);
				
				if(leftLen<rightLen) {
					answer+="L";
					left = move(left, numbers[i]/3, 1);
				}
				else if(leftLen>rightLen) {
					answer+="R";
					right = move(right,numbers[i]/3,1);
				}
				else {
					if(hand.equals("left")) {
						answer+="L";
						left = move(left, numbers[i]/3, 1);
					}
					else {
						answer+="R";
						right = move(right,numbers[i]/3,1);
					}
				}
				
				break;
			
			}
        }
        
        System.out.println(answer);
        
        
        return answer;
    }
    
    public int[] move(int[] hand, int row, int col) {
    	hand[0]=row;
    	hand[1]=col;
    	return hand;
    }

}