def perfect_squares(numbers):
    
    for number in numbers:
        if number < 0:```````
            return False
                        
        is_perfect = False
        i = 1
        while i * i <= number:
            if i * i == number:
                is_perfect = True
                break
            i += 1
            
        if not is_perfect:
            return False
            
    return True

test_list1 = [4, 9, 25, 49]
print(f"List: {test_list1}")
print(f"All elements are perfect squares: {perfect_squares(test_list1)}\n")

test_list2 = [4, 8, 25, 49]
print(f"List: {test_list2}")
print(f"All elements are perfect squares: {perfect_squares(test_list2)}\n")

test_list3 = [16, 0, 100]
print(f"List: {test_list3}")
print(f"All elements are perfect squares: {perfect_squares(test_list3)}\n")
