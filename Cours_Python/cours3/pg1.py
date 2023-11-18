# donner un programme qui teste la parité

n = int(input("Donner un nombre pour tester sa parité: "))

if n%2 == 0:
    print("%d est paire, sont carré est: %d." %(n, n*n))
else:
    print("%d est impaire, sont cube est: %d." %(n, n**3))