# un programme qui calcule le nombre de voyelles dans une phrase

text = input("Donner une phrase pour compter ses voyelles: ")
s = 0

for i in text:
    if i in ['a', 'o', 'u', 'i', 'e']:
        print(i)
        s+=1
        
print(s, "voyelle(s)")