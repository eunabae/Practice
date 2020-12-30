def solution(d, budget):

    answer = 0

    d.sort();

    for i in d:
        if(i>budget):
            break;
        else:
            budget-=i;
            answer+=1;
    
    print(answer);
    return answer

solution([1,3,2,5,4],9);