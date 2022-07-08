package ua.com.foxminded.carmanager;

public interface Serviseable {
	
	public boolean isReadiToService();
	
	public int getDistanceONService();
	
	public void addDistanceONService(int additionalDistance);
	
	public void addDistanceONService(double additionalDistance);
	
	public void addDistance(int additionalDistance);
	
	public void addDistance(double additionalDistance);
	
	public void makeService();
	
	

}
