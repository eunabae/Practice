def solution(s):
    s = s.split(' ')

    temp = [int(s[0])]*2

    for i in s:
        i = int(i)
        
        if i<temp[0]:
            temp[0] = i

        if i>temp[1]:
            temp[1] = i
    
    return str(temp[0]) + " " + str(temp[1])

print(solution("-1 -2 -3 -4"))