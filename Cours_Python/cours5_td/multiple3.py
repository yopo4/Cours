n = int(input("Entrer un nombre: "))

if n % 2 == 0:
    print("Ce nombre est pair.")
elif n % 2 != 0 and n % 3 == 0:
    print("Ce nombre est impair, mais multiple de 3.")
elif n % 2 != 0 and n % 3 != 0:
    print("Ce nombre n'est ni pair ni multiple de 3.")