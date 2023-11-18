# boucle while

i = 0

while i < 4:
    print(i)
    i += 1
    
n = int(input("Entrez un entier entre 1 et 10: ")) 

while 1 > n or n > 10 :
    print("Incorect")
    n = int(input("Entrez un entier entre 1 et 10: ")) 
else :
    print("Bravo")
