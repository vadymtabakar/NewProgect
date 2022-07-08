package ua.com.foxminded.carmanager;

public class CarManager {

	public static void main(String[] args) {
		
		//Motorcycle suzuki = new Motorcycle("Suzuki GSX-R1000", 2010, 2000, 800, "BLUE", "diesel", false);
		
		
		
		//Motorcycle yamaha = new Motorcycle("Yamaha  FZ1", 2021, 1800, 750, "golD ", "gas", false);
		
		
		Motorcycle honda = new Skuter("Honda Dio 65", 2019, 800, 750, "golD", "gas", false);
		
		
		Motorcycle kawasaki = new RaceMoto("Kawasaki 900", 2019, 800, 750, "gold ", "gas", false);
		
		
		
		/*suzuki.addDistance(260000.56);
		yamaha.addDistance(255000.45);
		
		suzuki.makeRepair();
		yamaha.makeRepair();
		
		suzuki.destroyEngine();
		yamaha.destroyEngine();
		
		suzuki.paint("gold ");*/
		
		
		/*System.out.println(suzuki);
		System.out.println(yamaha);*/
		
		
		
		honda.addDistance (10000);
		kawasaki.addDistance (15001);
		
		honda.makeService ();
		kawasaki.makeService ();
		
		
		System.out.println(honda);
		System.out.println(kawasaki);
		
		System.out.println(honda.isReadiToService());
		System.out.println(kawasaki.isReadiToService());
		
		
		
		
		
	}

}
