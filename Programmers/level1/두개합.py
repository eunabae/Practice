num = [2,1,3,4,1]

def solution(numbers):
    answer = []

    # 계산
    for i in range(0,len(numbers)-1):
        for j in range(i+1,len(numbers)):
            val = numbers[i]+numbers[j]
            if val not in answer:
                answer.append(val)
            
    # 정렬
    answer.sort()
    return answer

solution(num);