import java.util.Scanner;
public class ParkingLot{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		int [] park = new int [20];
		for(int count; count <= 20; count++){
			System.out.print("Enter a slot number");
			park[count] = input.nextInt();
				if (park[count] == 0){
					System.out.print("Slot is Empty");
				}
				else if (park[count] == 1){
					System.out.print("Slot is Occupied");
				}

		}
	}
}