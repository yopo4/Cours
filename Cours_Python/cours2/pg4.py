s1 = "Text de test"
s2 = " La vie"
s3 = " est "
s4 = "belle."

print('Opération sur les chaines: Helper')
print(f'Opération sur les chaines: Helper {s2}')

s5 = s2 + s3 + s4
s6 = s2 * 3

print(s5)
print(s6)
print(len(s1))
print(s2.strip())
print(len(s2))
print(len(s2.strip()))
print(s1.lower())
print(s1.upper())
print(s1.isupper())
print(s1.find('ext'))
print(s1.count('e'))
print(s1.replace('e', 'w', 1))
print(s1.replace('e', 'w'))
print(s1.split(' '))
print(s1.split())
print(max(s2))
print(min(s2))
print('a' in s2)
print('vi' not in s2)