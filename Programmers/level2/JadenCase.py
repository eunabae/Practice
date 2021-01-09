def solution(s):
    answer = ''

    temp = s.split(' ');

    for i in range(len(temp)):
        temp[i]= temp[i].capitalize()
    
    return " ".join(temp)

print(solution("3people unFollowed me"))