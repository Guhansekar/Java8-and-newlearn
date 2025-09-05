package SortingEx;

public class Mobile implements Comparable<Mobile> {
	
	public enum Brand{
				APPLE,REDMI,OPPO,VIVO;
	}
	
	private Brand brand;
	private String model;
	private String camera;
	private String battery;
	private int price;
	
	
	public Mobile(Brand brand, String model, String camera, String battery, int price) {
		super();
		this.brand = brand;
		this.model = model;
		this.camera = camera;
		this.battery = battery;
		this.price = price;
	}
	public Brand getBrand() {
		return brand;
	}
	public String getModel() {
		return model;
	}
	public String getCamera() {
		return camera;
	}
	public String getBattery() {
		return battery;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public int compareTo(Mobile mob) {
		
		if(this.getPrice()<mob.getPrice())
		{
			return -1;
		}
		else if(this.getPrice()>mob.getPrice())
		{
			return 1;
		}
		else
		return 0;
	}
	
	

}
