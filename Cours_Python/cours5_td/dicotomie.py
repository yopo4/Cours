l = [15, 21, 17, 65, 84, 5, 2, 3, 8, 8, 5, 2, 384, 1]
l.sort()
n = int(input("Donner le nombre sur quoi tester: "))
start = 0
end = len(l) - 1
while end >= start:
    m = (start + end) // 2
    if n > l[m]:
        start = m + 1
    elif n < l[m]:
        end = m - 1
    else:
        print("L'élement se trouve dans la position :", m)
        break
else:
    print("Element introuvable")
