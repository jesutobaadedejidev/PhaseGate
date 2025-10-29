import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

	public class SumTest{
	
	@Test
	public void testThatThereAreElementsInTheArray(){
	
	//Arrange
	Sum sum = new Sum();

	//Act
	int result = sum.elementsInTheArray();

	//Assert
	assertEquals(result, myArray);
	}
}