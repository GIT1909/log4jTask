package epam.task;
import org.apache.log4j.Logger;


public class InterestCalculator {
	
	static final Logger LOGGER=Logger.getLogger("Main.class");
	public double simpleInterest(double princple,double duration,double rateofinterest){
		double a=(princple*duration*rateofinterest)/100;
		LOGGER.info(a);
		LOGGER.error("correction is needed");
		LOGGER.warn("there is something wrong in code");
		LOGGER.fatal("there is any case of abort");
		return a;
		
		
	}
	public double  compoundInterest(double princple,double duration,double rateofinterest )
	{
		double  ci=princple*(Math.pow((1+(rateofinterest/100)),duration));
		ci=ci-princple;
		LOGGER.info(ci);
		LOGGER.error("correction is needed");
		LOGGER.warn("there is something wrong in code");
		LOGGER.fatal("there is any case of abort");
		
		return ci;
	}
	
	

}
