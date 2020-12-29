def solution(n):
    answer = 0;
    temp=[];

    # 3진법 변환
    while n!=0:
        temp.insert(0,n%3);
        n=int(n/3);

    # 10진법 변환
    count=0;
    for i in temp:
        answer += i*pow(3,count);
        count+=1;

    print(answer);
    return answer

solution(45);