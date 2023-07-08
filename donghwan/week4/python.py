import math

def solution(n):
    answer = 0
    for i in range(1, n + 1):
        if is_prime(i):
            answer += 1
    
    return answer

def is_prime(n):
    if n == 1:
        return False
    
    sqrt_n = int(math.sqrt(n))
    for i in range(2, sqrt_n + 1):
        if n % i == 0:
            return False
    
    return True
