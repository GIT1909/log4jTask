import epam.task.InterestCalculator;
import org.junit.Assert;
import org.junit.Test;

public class InterestCalculatorTest {

	InterestCalculator i = new InterestCalculator();
	
	@Test
	public void testSimpleInterest() {
		
		Assert.assertEquals(60.0,i.simpleInterest(1000.0,2.0,3.0),0);
		
	}
	
	@Test
	public void testCompoundInterest() {
		
		Assert.assertEquals(2.0,i.compoundInterest(100.0, 1.0, 2.0),0);
		
	}

}
