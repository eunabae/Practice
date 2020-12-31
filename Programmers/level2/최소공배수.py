from math import gcd

# 최대공약수 = 유클리드 호제법
# def ugcd(a,b):
#     if(b>a):
#         temp = a
#         a=b
#         b=temp

#     while b !=0:
#         c = a % b
#         a=b
#         b=c

#     return a    
    

def solution(arr):
    answer = 0

    # a,b 최소 공배수 = a*b/gcd (gcd=최대 공약수)

    while len(arr) >1:
        a = arr.pop()
        b = arr.pop()

        lcm = int((a*b)/gcd(a,b))

        arr.append(lcm)

    answer = arr[0] 
    return answer


solution([2,6,8,14]);