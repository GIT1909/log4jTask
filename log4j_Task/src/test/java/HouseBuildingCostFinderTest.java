import org.junit.Assert;
import org.junit.Test;

import epam.task.HouseBuildingCostFinder;

public class HouseBuildingCostFinderTest {
	HouseBuildingCostFinder h = new HouseBuildingCostFinder();
	@Test
	public void houseCostTest() {
		
		
		
		Assert.assertEquals(250000.0,h.houseCost("high standard material" , 100, "yes"),0);
		
	}

}
