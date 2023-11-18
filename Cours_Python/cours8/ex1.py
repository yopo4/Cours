i = 0
n = float(input("Donner une note pour savoire la mention: "))

while n < 0 or n > 20:
    print("Le nombre saisie est invalide.")
    n = float(input("Donner une note pour savoire la mention: "))

if 0 <= n < 10:
    print("Redoublant")
elif n < 12:
    print("Passable")
elif n <= 20:
    print("Mention")
i+=1
    
while True:
    conf = input("Saisir une note (y/n): ")
    conf = conf.lower()

    if conf == 'y':
        n = float(input("Donner une note pour savoire la mention: "))

        while n < 0 or n > 20:
            print("Le nombre saisie est invalide.")
            n = float(input("Donner une note pour savoire la mention: "))

        if 0 <= n < 10:
            print("Redoublant")
        elif n < 12:
            print("Passable")
        elif n <= 20:
            print("Mention")
        i+=1
            
    elif conf == 'n':
        print(f"Le nombre d'etudiant est {i}.")
        break
