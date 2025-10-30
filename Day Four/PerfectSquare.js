function perfectSquare (numbers){
	for number in numbers
		if number < 0 
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

test_list = [4, 9, 25, 49]
console.log(List[test_list])
console.log(perfectSquare(test_list))