package epam.task;
import org.apache.log4j.Logger;
public class HouseBuildingCostFinder {


	double cost=0;
	static final Logger logger=Logger.getLogger("HouseBuildingCostFinder.class");
	public double houseCost(String materialstandard,double area,String automated)
	{
		if (materialstandard.equals("StandardMaterials"))
		{
			
			cost=cost+(1200*area);
			logger.info(cost);
			logger.error("There will be corrrection");
			logger.warn("there is something wrong in code");
			logger.fatal("there is any case of abort");
				
			
			
		}
		
		else if (materialstandard.equals("above standard materials"))
		{
			
			cost=cost+(1500*area);
			
			logger.info(cost);
			logger.error("There will be corrrection");
			logger.warn("there is something wrong in code");
			logger.fatal("there is any case of abort");
				
			
			
		}
		else
		{
			if (automated.equals("yes" ))
			{cost=cost+(2500*area);
			
			logger.info(cost);
			logger.error("There will be corrrection");
			logger.warn("there is something wrong in code");
			logger.fatal("there is any case of abort");
				
			}
			else
			{
				cost=cost+(1800*area);
				logger.info(cost);
				logger.error("There will be corrrection");
				logger.warn("there is something wrong in code");
				logger.fatal("there is any case of abort");
					
			}
			
		}
		
		
	return(cost);	
	}

}
