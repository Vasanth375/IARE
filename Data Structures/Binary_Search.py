def binarySearch(arr, l, h, x):
    if h>=l:
        mid = (l+h)//2
        if arr[mid] == x:
            return mid
        elif arr[mid] > x:
            return binarySearch(arr, l, mid-1, x)
        elif arr[mid] < x:
            return binarySearch(arr, mid+1, h, x)
    return -1

arr = [1,2,1,2,6,12,2,4]
j = arr.copy()
arr = sorted(arr)
low, high = 0, len(arr)
print(binarySearch(arr, 0, len(arr)-1, 2))
print("Original List", j)
print("Sorted List ", arr)
