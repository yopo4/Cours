# donner un programme qui gere une preselection par rapport à la taille de l'utilisateur et son sexe

sexe = input("Entrez votre sexe (Homme/Femme ou H/F): ")
taille = int(input("Entrez votre taille (en cm): "))
sexe = sexe.lower()

if sexe == "femme" or sexe == "f":
    if taille < 150:
        print("Refusé.")
    elif taille >= 160:
        print("Accepté !")
    else:
        print("En cours de traitement...")
elif sexe == "homme" or sexe == "h":
    if taille < 160:
        print("Refusé.")
    elif taille >= 170:
        print("Accepté !")
    else:
        print("En cours de traitement...")
else:
    print("Reponse invalide, relancez le programme.")
