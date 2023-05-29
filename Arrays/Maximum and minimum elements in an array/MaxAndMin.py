# to print maximum and minimum value in a list
#here no need of specifying the size, you can directly enter the list elements with spaces
n = list(map(int, input().split()))
maximum = n[0] 
minimum = n[0]
print(n)
for i in range(1,len(n)):
    if(n[i] > maximum):
        maximum = n[i]
    if(n[i] < minimum):
        manimum = n[i]
print("maximum: ",maximum)
print("minimum: ",minimum)
