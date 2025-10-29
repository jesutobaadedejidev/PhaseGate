import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

	public class ReverseTest{

	@Test
	public void testThatNoWordIsGiven(){
	
	//Arrange
	Reverse reverse = new Reverse();

	//Act
	int result = reverse.totalNumberOfWords();

	//Assert
	assertEquals(result, 0);
	}

	@Test
	public void testThatOneWordIsGiven(){
	
	//Arrange
	Reverse reverse = new Reverse();

	//Act
	String response = reverse.addWord("adcdefd");

	//Assert
	assertEquals(response, "Word added successfully");
	}

	@Test
	public void testThatTheWordIsReversedUpUntilCharacter(){
	
	//Arrange
	Reverse reverse = new Reverse();
	}
	
}