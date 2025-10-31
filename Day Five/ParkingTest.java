import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
	public class ParkingTest{
	
	@Test
	public void testThatAParkingSlotHasNoCar(){
	
	//Arrange
	
	Parking parking = new Parking();

	//Act
	int result = parking.totalNumberOfCars();

	//Assert
	assertEquals(result, 0);
	}

	@Test
	public void testThatACarCanBeParkedAtTheParkingLot(){

	//Arrange
	
	Parking parking = new Parking();

	//Act
	String response = parking.addCar("Rolls Royce Cullinan");

	//Assert
	assertEquals(response, "Car packed successfully");
	}
	
	@Test
	public void testThatAParkingSlotIsOccupiedByACar(){

	//Arrange

	Parking parking = new Parking();

	//Act
	parking.addCar("Lamborghini Urus Masonry");
	int result = parking.totalNumberOfCars();

	//Assert
	assertEquals(result, 1);
	}

	//@Test
	//public void testThatThereAreTwentySlotsThatCanBeOccupiedAtTheParkingLot(){
	
	//Arrange
	//Parking parking = new Parking();

	//Act
	//int [] park = new int [20];
	//int result = parking.totalNumberOfCars();

	//Assert
	//assertEquals(result, 20);
	//}
}