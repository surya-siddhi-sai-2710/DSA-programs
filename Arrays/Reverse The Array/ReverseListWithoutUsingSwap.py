#reversing without using swap
n = list(map(int, input().split()))
print("original list: ",n)
print("reversed list: ",end="")
for i in range(len(n)-1,-1,-1):
    print(n[i],end=" ")
