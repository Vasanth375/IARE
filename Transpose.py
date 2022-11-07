a = []

for i in range(3):
    k = [int(o) for o in input().split()]
    a.append(k)

print(a)

b=[]
for i in range(len(a)):
    k = []
    for j in range(len(a[i])):
        k.append(a[j][i])
    b.append(k)
print(b)
