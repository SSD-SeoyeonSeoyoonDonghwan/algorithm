def solution(s):
    length = len(s)
    
    if (length != 4 and length != 6):
        return False
    
    if not s.isdigit():
        return False
        
    return True
