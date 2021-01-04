
def solution(n):
    answer = 0
    fibo = []

    fibo.append(0)
    fibo.append(1)

    for i in range(2,n+1):
        temp = fibo[i-1] + fibo[i-2]
        fibo.append(temp)

    answer = fibo[n] % 1234567
    return answer

print(solution(3))