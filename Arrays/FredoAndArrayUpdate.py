"""
Fredo and Array Update:
Fredo assigned a new task today. He is given an array A containing N integers. His task is to update all
elements of array to some minimum value x, that is, A[i] = x; 1<=i<=N such that sum of this new array is strictly
greater than the sum of the initial array. Note that x should be as minimum as possible such that sum of the new array
is greater than the sum of the initial array.

Input Format:
First line of input consists of  an integer N denoting the number of elements in the  array A
Second line consists of N space seperated integers denoting the array elements

Output format:
the only line of output consists of the value of x

sample input:
5
1 2 3 4 5

sample output:
4

Explaination:
initial sum of array = 1 + 2 + 3 + 4 + 5 = 15
when we update all the array elements with 4, sum of array = 4 + 4 + 4 + 4 + 4 = 20.
Note that if we updated the array elements to 3, sum = 15, which is not greater than 15.
so, 4 is the minimum value.

"""
def findMax(arr,n):
    sum = 0
    for i in range(n):
        sum += arr[i]
    return (sum // n) + 1

n = int(input())
arr = list(map(int,input().split()))
print(findMax(arr, n))
