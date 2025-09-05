package SortingEx;

public class Mobile2 {
	public enum Brand{
		APPLE,REDMI,OPPO,VIVO;
}

private Brand brand;
private String model;
private String camera;
private String battery;
private int price;


public Mobile2(Brand brand, String model, String camera, String battery, int price) {
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
}
