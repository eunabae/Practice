package level1;


public class doll {

	public static void main(String[] args) {

		Solution1 s =new Solution1();
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		s.solution(board, moves);
	}
}


class Solution1 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int[] doll = new int[moves.length];
        int num=0;
        
        for(int i=0; i<moves.length; i++){
            
            for(int j=0; j<board.length ; j++){
                if(board[j][moves[i]-1]!=0){
                     doll[num]=board[j][moves[i]-1];
                     board[j][moves[i]-1]=0;
                     num++;
                    break;               
                }
            }
            
             for(int k=0; k<doll.length-1; k++){
                 //System.out.print(doll[k]);
                 if(doll[k]!=0 && doll[k]==doll[k+1]){
                    //System.out.print(doll[k]);
                    answer=answer+2;
                    doll[k]=doll[k+1]=0;
                    num=num-2;
                 }
            }
            
        } 
        System.out.println(answer);

        return answer;
    }
    
}

