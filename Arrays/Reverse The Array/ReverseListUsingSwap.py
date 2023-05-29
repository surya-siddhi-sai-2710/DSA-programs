#using swapping method reversing the elements of list
n = list(map(int, input().split()))
print("original list: ",n)
start = 0
end = len(n)-1
while(start<end):
    temp = n[start]
    n[start] = n[end]
    n[end] = temp
    start += 1
    end -= 1
print("reversed list: ",n)
