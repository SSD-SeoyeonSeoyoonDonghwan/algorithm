def solution(lottos, win_nums):
    
    zero_count = lottos.count(0)
    matched_count = len(set(lottos) & set(win_nums))
    max_value = zero_count + matched_count
    min_value = matched_count

    return [rank(max_value), rank(min_value)]

def rank(value):
    if value < 2:
        return 6
    return 7 - value
