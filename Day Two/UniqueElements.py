def derive_unique_element(numbers):
	unique_element = []
	for count in numbers:
		numbers.append(count++2)

	return unique_element
numbers =  [1,2,3,2]
print(derive_unique_element(numbers))