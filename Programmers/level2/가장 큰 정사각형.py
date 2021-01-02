
def solution(board):
    answer = 0

    for i in range(1,len(board)):
        for j in range(1,len(board[i])):
            if(board[i][j] != 0):
                board[i][j] = min(board[i-1][j],board[i][j-1],board[i-1][j-1])+1
    
    answer = max(map(max,board))

    print(answer)
    return answer*answer

solution([[0,0],[0,0]])

#
# def findbox(boxes, head):
#     newBox = []
#     newHead = []

#     for i in range(len(boxes)):
#         trueCheck=4*[False]
#         for j in range(len(boxes[i])):
#             if boxes[i][j] in head:
#                 trueCheck[j]=True

#         if False not in trueCheck:
#             newBox.append(boxes[i])
#             newHead.append(boxes[i][0])

#     return newBox,newHead

# def solution(board):
#     answer = 0
#     box1=[]
#     box2=[]

#     for i in range(len(board)-1):
#         for j in range(len(board[i])-1):
#             # 1x1 box #
#             if(answer==0 and (board[i][j] or board[i][j+1] or board[i+1][j] or board[i+1][j+1])==1):
#                 answer=1

#             # 2x2 box #
#             if(board[i][j]==board[i][j+1]==board[i+1][j]==board[i+1][j+1]==1):
#                 box = [[i,j],[i,j+1],[i+1,j],[i+1,j+1]]
#                 box1.append(box)
#                 box2.append([i,j])
            

#     while (len(box1) is not 0):
#         answer+=1
#         box1,box2=findbox(box1,box2)

#     return answer*answer