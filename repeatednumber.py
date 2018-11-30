n=int(input())
unique=1
il,dl=(list(),list())
sl=list(map(int, input().split(' ')))
for i in range(0,len(sl)):
    ele=sl[i]
    if ele in il:
        if ele not in dl:
            dl.append(ele)
    il.append(ele)
dl.sort()
if len(dl) is 0:
    print("unique")
else:
    for i in dl:
        print(i,end=' ')
