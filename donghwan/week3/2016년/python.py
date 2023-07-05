def solution(a, b):
    monthly = [0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    day_of_week = ["FRI","SAT","SUN","MON","TUE","WED","THU"]
    
    total_month = sum(monthly[1:a])
    total_day = b - 1
    total = total_month + total_day
    return day_of_week[total%7]
