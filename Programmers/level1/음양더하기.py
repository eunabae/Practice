def solution(absolutes, signs):
    answer=[]

    for i,j in zip(absolutes, signs):        
        if(not j):
            answer.append(-i)  
        else:
            answer.append(i)
            
    return sum(answer)

solution([4,7,12],[True,False,True])