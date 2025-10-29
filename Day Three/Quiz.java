import java.util.Scanner;
	public class Quiz{
		public static void main(String []args){
			Scanner input = new Scanner(System.in);
			int count = 0;
			System.out.println("Welcome to the Quiz Game. Pick from options 1 to 4");
			System.out.println("");
			System.out.println("Question1: Who won the 2014 World Cup?");
			System.out.println("1. Brazil  2. Germany  3. Egypt  4. France?");
			int firstoptions = input.nextInt();
			if (firstoptions == 2){
				System.out.println("Correct!");
				count ++;
			}else{
				System.out.println("Wrong Answer!");
			}
			System.out.println("");
			System.out.println("Question2: What is the capital of Portugal?");
			System.out.println("1. Kuwait  2. Brasilia  3. Paris  4. Lisbon");
			int secondoptions = input.nextInt();
			if (secondoptions == 4){
				System.out.println("Correct!");
				count ++;
			}else{
				System.out.println("Wrong Answer!");
			}
			System.out.println("");
			System.out.println("Question3: How many days are in a leap year?");
			System.out.println("1. 234  2. 345  3. 366  4. 452");
			int thirdoptions = input.nextInt();
			if (thirdoptions == 3){
				System.out.println("Correct!");
				count ++;
			}else{
				System.out.println("Wrong Answer!");
			}
			System.out.println("");
			System.out.println("Question4: What is the chemical formula for Potassium?");
			System.out.println("1. K  2. Au  3. Ca  4. Ag");
			int fourthoptions = input.nextInt();
			if (fourthoptions == 1){
				System.out.println("Correct!");
				count ++;
			}else{
				System.out.println("Wrong Answer!");
			}
			System.out.println("");
			System.out.println("Where is the Christ the Redeemer statue located?");
			System.out.println("1. Atlanta  2. Azerbaijan  3. Rio de Janeiro   4. Dutse");
			int fifthoptions = input.nextInt();
			if (fifthoptions == 3){
				System.out.println("Correct!");
				count ++;
			}else{
				System.out.println("Wrong Answer!");
			}
			System.out.println("");
			System.out.print("Quiz Finished! You scored " + count + " out of 5");
		}
	}