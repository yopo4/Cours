txt1 = input("Donner une chaine de caracteres: ")
txt2 = input("Donner une chaine de caracteres: ")

if len(txt1) > len(txt2):
    print('"', txt1, '" est la plus grande, avec', len(txt1), "caracteres.")
elif len(txt2) > len(txt1):
    print('"', txt2, '" est la plus grande, avec', len(txt2), "caracteres.")
else:
    print('"', txt2, '" et', '"', txt1, '" sont égaux, avec', len(txt2), "caracteres.")