def solution(s):
    idx = len(s)
    value = idx//2
    if idx % 2 == 0:        
        return s[value-1 : value+1]
    else:
        return s[value : value+1]
