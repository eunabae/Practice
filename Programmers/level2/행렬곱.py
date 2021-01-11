def solution(arr1, arr2):
    answer = []

    for i in arr1:
        row=[]
        for j in range(len(arr2[0])):
            temp=0
            for k in range(len(arr1[0])):
                temp += i[k]*arr2[k][j]
            row.append(temp)
        answer.append(row)
    return answer

print(solution([[2, 3, 2], [4, 2, 4], [3, 1, 4]], [[5, 4, 3], [2, 4, 1], [3, 1, 1]]))