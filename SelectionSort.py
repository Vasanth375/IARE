def SelectionSort(arr):
    for i in range(len(arr)):
        min_index = i
        for j in range(i+1, len(arr)):
            if arr[j] < arr[min_index]:
                min_index = j
    print(min_index)
'''        temp = arr[i]
        arr[i] = arr[min_index]
        arr[min_index] = temp'''
SelectionSort([3,-1,2,5,0])