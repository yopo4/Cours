devise = input("Choisissez entre 'DH' et '$': ")
montant = float(input("Donner le montant: "))

devise = devise.lower()

if devise == "dh":
    montant *= 10
elif devise == '$':
    montant /= 10
else:
    print("Relancez ke programme.")

print("Le montant apres conversion est:", montant, devise.upper())