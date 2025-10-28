import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

	public class DepreciationTest{

	@Test
	public void testThatItemIsNotFreeAtFirst(){
	//Arrange

	Depreciation depreciation = new Depreciation();

	//Act
	int result = depreciation.totalPriceOfItems();

	//Assert
	assertEquals(result, 50000);
	
	}

	@Test
	public void testThatTheItemsDeprecatePerYearAndThePercentageDepreciationIsEightPercent(){
	
	//Arrange
	Depreciation depreciation = new Depreciation();

	//Act
	Int response = 
	}
}