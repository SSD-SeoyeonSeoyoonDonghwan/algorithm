words = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"]

def solution(s):
    for index, word in enumerate(words):
        s = s.replace(word, str(index))
    return int(s)
