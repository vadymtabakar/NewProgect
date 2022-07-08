package ua.com.foxminded.carmanager;

public class Skuter extends Motorcycle {

	public Skuter(String name, int yearOfProduction, int price, int weight, String Color, String engineType,
			boolean readyToStart) {
		super(name, yearOfProduction, price, weight, Color, engineType, readyToStart);
	}

	@Override
	public boolean isReadiToService() {
		if (distanceONService > 10000) {
			makeService();
			return true;
		}
			return false;
	}

	public void  makeService() {
		 if (distanceONService > 10000) 
			 distanceONService =0;
	}
			 

	
	
}
