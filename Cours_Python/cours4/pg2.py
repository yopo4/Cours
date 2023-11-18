# Ecrire un programme en Python qui permet de calculer le PGCD de deux entiers positifs donnés a et b par la méthode de soustraction
# • Pgcd(a, b)=Pgcd(a-b, a) si a>b
# • Pgcd(a, b)=Pgcd(a, b-a) si b>a
# • Pgcd(a, b)=a si a=b

a = int(input("Entrer le premier nombre: "))
b = int(input("Entrer le deuxieme nombre: "))
pgcd = 0

while a < 0 or b < 0:
    a = int(input("Entrer le premier nombre: "))
    b = int(input("Entrer le deuxieme nombre: "))

while a != b:
    if a < b:
        b = b - a
    elif a > b:
        a = a - b
if a == b:
    print(a)
