# Дано натуральное число N. Требуется представить его в виде суммы двух натуральных чисел A
# и B таких, что НОД (наибольший общий делитель) чисел A и B — максимален.
# Ограничение по времени выполнения программы - 1 секунда, ограничение по используемой
# памяти - 64 мегабайта.
# Входные данные
# Во входном файле записано натуральное число N (2≤N≤109)
def gcd(a, b):
    if a % b == 0:
        return b
    if b % a == 0:
        return a

    if a > b:
        return gcd(a % b, b)
    else:
        return gcd(a, b % a)


def get_prime_nmbrs(n):
    prime_nmbrs = [False] * (n + 1)
    prime_nmbrs[1] = True
    i = 2
    while i*i < n+1:
        if prime_nmbrs[i]:
            j = i * i
            while j < n+1:
                prime_nmbrs[j] = True
                j += i
        i += 1
    return prime_nmbrs


def compute(n):
    prime_nmbrs = get_prime_nmbrs(n)
    if prime_nmbrs[n]:
        return [1, n - 1]
    i = 2
    if n % i:
        for i in range(3, n + 1, 2):
            if not n % i:
                break

    return [n // i, (i - 1) * (n // i)]
