package ua.com.foxminded.carmanager;

public class RaceMoto extends Motorcycle {

	public RaceMoto(String name, int yearOfProduction, int price, int weight, String Color, String engineType,
			boolean readyToStart) {
		super(name, yearOfProduction, price, weight, Color, engineType, readyToStart);
	}

	@Override
	public boolean isReadiToService() {
		if (distanceONService > 15000) {
			makeService();
			return true;
		}
			return false;
	}

	public void  makeService() {
		 if (distanceONService > 15000) 
			 distanceONService =0;
	}
			 

	
}
