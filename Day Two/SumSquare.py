def derive_sum_square_of_the(my_list):
	sum_square = 0
	for count in my_list:
		sum_square = sum_square + (count ** 2)

	return sum_square
my_list = [2, 3, 4, 5, 7]
print(derive_sum_square_of_the(my_list))