def filter_positive_numbers(numbers):
    return [num for num in numbers if num > 0]
list1 = [12, -7, 5, 64, -14]
list2 = [12, 14, -95, 3]
print("Input: list1 =", list1)
print("Output:", ", ".join(map(str, filter_positive_numbers(list1))))

print("Input: list2 =", list2)
print("Output:", filter_positive_numbers(list2))