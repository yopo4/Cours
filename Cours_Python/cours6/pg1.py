from math import pi


# def cube(x):
#     return x**3


# def volumeSphere(radius):
#     return 4 * pi * cube(radius) / 3


# radius = float(input("Rayon: "))
# print("Le volume est:", volumeSphere(radius))


# def surfaceVolumeSphere(radius):
#     surf = 4 * pi * radius**2
#     vol = surf * radius / 3
#     return surf, vol


# s, v = surfaceVolumeSphere(radius)
# print("La surface est:", s, "et le volume est:", v)


# def somme(*args):
#     resultat = 0
#     for i in args:
#         resultat += i
#     print(resultat)


# somme(12, 15, 8)


def table(mul, bornI, bornS):
    while bornI <= bornS:
        print(f"{bornI} * {mul} = {bornI * mul}")
        bornI += 1


table(
    mul=int(input("Saisir le nbr de multiplicateur: ")),
    bornI=int(input("Saisir la born inferieure: ")),
    bornS=int(input("Saisir la born seperieure: ")),
)