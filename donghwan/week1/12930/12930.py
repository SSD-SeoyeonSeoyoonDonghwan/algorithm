def solution(s):
    index = 0
    answer = ""
    for i in range(len(list(s))):
        if s[i] == " ":
            index = 0
            answer += " "
        elif index % 2 == 0:
            index += 1
            answer += s[i].upper()
        else:
            index += 1
            answer += s[i].lower()
            
    return answer
