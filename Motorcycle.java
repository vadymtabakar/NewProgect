package ua.com.foxminded.carmanager;

public abstract class Motorcycle implements Serviseable {

	String name;
	int yearOfProduction;
	int price;
	int weight;
	Color color;
	String engineType;
	boolean readyToStart;
	private int distance = 0;
	protected int distanceONService = 0;
	
	
	public Motorcycle(String name, int yearOfProduction, int price, int weight, String color, String engineType,
			boolean readyToStart ) {
		this.name = name;
		this.yearOfProduction = yearOfProduction;
		this.price = price;
		this.weight = weight;
		this.color = Color.valueOf(color.toUpperCase().replace(" ",""));
		this.engineType = engineType;
		this.readyToStart = readyToStart;
		
		
	}
	
	public boolean makeRepair() {
		if (readyToStart == true) 
			return readyToStart;
		else 
			return readyToStart = true;
		}
	
	
	public boolean destroyEngine() {
		if (distance>200000) {
			return readyToStart = false;
			}else {
		return readyToStart;
		}
	}
	
	//*****
	
	public void paint(String repaint) {
		this.color = Color.valueOf(repaint.toUpperCase().replace(" ",""));
	}
	
	//*****
	
	public void addDistanceONService(int additionalDistance) {
		
		distanceONService += additionalDistance;
	}
	
	public void addDistanceONService(double additionalDistance) {
		
		distanceONService += additionalDistance;
		
	}
	
	public void addDistance(int additionalDistance) {
		
		distance += additionalDistance;
		addDistanceONService(additionalDistance);
		
	}
	
	public void addDistance(double additionalDistance) {
		
		distance +=Math.round(additionalDistance);
		addDistanceONService(Math.round(additionalDistance));
	}
	
	//*****
	
	public abstract void makeService();
	
	//**
	
	public int getDistanceONService() {
		return distanceONService;
	}

	public int getDistance() {
		return distance;
	}

	
		
	
	
	//***** 
	
	@Override
	public String toString() {
		return "Motorcycle [name=" + name + ", yearOfProduction=" + yearOfProduction + ", price=" + price + ", weight="
				+ weight + ", color=" + color.nameOfColor + ", engineType=" + engineType + ", readyToStart=" + readyToStart
				+ ", distance=" + distance + ", distanceONService=" + distanceONService + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((engineType == null) ? 0 : engineType.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
		result = prime * result + (readyToStart ? 1231 : 1237);
		result = prime * result + weight;
		result = prime * result + yearOfProduction;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Motorcycle other = (Motorcycle) obj;
		if (color != other.color)
			return false;
		if (engineType == null) {
			if (other.engineType != null)
				return false;
		} else if (!engineType.equals(other.engineType))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		if (readyToStart != other.readyToStart)
			return false;
		if (weight != other.weight)
			return false;
		if (yearOfProduction != other.yearOfProduction)
			return false;
		return true;
	}


	

	
	
	

	
	}
	
	
	
