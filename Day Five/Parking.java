public class Parking{

	int count = 0;
	public int totalNumberOfCars(){
		return count;
	}
	public String addCar(String CarName){
		count ++;
		return "Car packed successfully";
	}
	public int totalNumberOfCars(int CarSize){
		while (count <= 20);
		return count;
	}
}