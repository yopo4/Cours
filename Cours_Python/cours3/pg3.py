# Boucle for:
# Forme 1
for i in "Bonjour":
    print(i, end="")
else:
    print(" Fin")

# Forme 2
for i in range(3, 10, 2):
    print(i, end=" ; ")
else:
    print("Fin")

# Forme 3
for i in range(10):
    print(i, end=" ; ")
else:
    print("Fin")

# Forme 4
for i in [3, 'a', 50, 16.5]:
    print(i, end=" ; ")
else:
    print("Fin")