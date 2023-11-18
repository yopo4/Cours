mdp = input("Entrez un mot de passe pour tester son niveau de securité: ")
score = 0
com = ""


def nbMin(mdp):
    n = 0
    for i in mdp:
        if i.islower():
            n += 1
    return n


def nbMaj(mdp):
    n = 0
    for i in mdp:
        if i.isupper():
            n += 1
    return n


def nbAlpha(mdp):
    symboles = ""
    for i in mdp:
        if not i.isalpha():
            symboles += i
    return len(symboles)


def longMaj(mdp):
    l = []
    maxSequence = 0
    for i in mdp:
        if i.isupper():
            maxSequence += 1
        else:
            l.append(maxSequence)
            maxSequence = 0

    for i in range(len(l) - 1):
        if maxSequence <= l[i]:
            maxSequence = l[i]
    return maxSequence


def longMin(mdp):
    l = []
    maxSequence = 0
    for i in mdp:
        if i.islower():
            maxSequence += 1
        else:
            l.append(maxSequence)
            maxSequence = 0

    for i in range(len(l) - 1):
        if maxSequence <= l[i]:
            maxSequence = l[i]
    return maxSequence


bonus = (
    len(mdp) * 4
    + (len(mdp) - nbMaj(mdp)) * 2
    + (len(mdp) - nbMin(mdp)) * 3
    + nbAlpha(mdp) * 5
)

penalite = longMin(mdp) * 2 + longMaj(mdp) * 3

print("================================================================")
print("Vos stats sont: ")
print("-longueure:", len(mdp))
print("-minuscules:", nbMin(mdp))
print("-majuscules:", nbMaj(mdp))
print("-alphanumeriques:", nbAlpha(mdp))
print("-plus grande sequence en minuscules:", longMin(mdp))
print("-plus grande sequence en majuscules:", longMaj(mdp))
print("================================================================")
print("Vos bonus sont:", bonus)
print("Vos penalités sont:", penalite)
if bonus < 20:
    com = "faible"
elif bonus < 40:
    com = "fort"
elif bonus < 80:
    com = "tres fort"
else:
    com = "tres faible"
print("Voici votre score final:", bonus - penalite, ", c'est", com)