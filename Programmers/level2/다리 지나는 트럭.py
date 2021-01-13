def solution(bridge_length, weight, truck_weights):
    answer = 0
    
    ing = [0]*bridge_length

    while len(ing)>0:
        answer+=1
        ing.pop(0)
        
        if len(truck_weights)>0:
            if sum(ing)+truck_weights[0] <= weight:
                ing.append(truck_weights.pop(0))

            else:
                ing.append(0)

    return answer

print(solution(100, 100, [10]))