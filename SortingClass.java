package SortingEx;

import java.util.*;

import SortingEx.Mobile.Brand;

public class SortingClass {
	public static List<Mobile> mobiles=new ArrayList<Mobile>();
	
	public static void main(String[] args) {
		
		
		Mobile m1=new Mobile(Brand.APPLE, "15", "64mb", "5000mah", 90000);
		Mobile m2=new Mobile(Brand.REDMI,"note8","48mb","4000mah",12000);
		Mobile m3=new Mobile(Brand.REDMI,"note7","48mb","4000mah",11000);
		Mobile m4=new Mobile(Brand.REDMI,"12c","50mb","5000mah",8500);
		Mobile m5=new Mobile(Brand.OPPO,"44","50mb","5000mah",45000);
		
		mobiles=Arrays.asList(m1,m2,m3,m4,m5);
		System.out.println("before sorting...");
		display();
		System.out.println("after sorting...");
		display2();
	}
		
		public static void display() {
			System.out.printf("| %-15s| %-15s| %-15s| %-15s| %-15s|%n","Brand","Model","Camera","Battery","Price");
			
			for(Mobile m:mobiles) {
				System.out.printf("| %-15s| %-15s| %-15s| %-15s| %-15d|%n",m.getBrand(),m.getModel(),m.getCamera(),m.getBattery(),m.getPrice());
			}
		}
		public static void display2() {
			Collections.sort(mobiles);

			System.out.printf("| %-15s| %-15s| %-15s| %-15s| %-15s|%n","Brand","Model","Camera","Battery","Price");
			
			for(Mobile m:mobiles) {
				System.out.printf("| %-15s| %-15s| %-15s| %-15s| %-15d|%n",m.getBrand(),m.getModel(),m.getCamera(),m.getBattery(),m.getPrice());
			}
		}
	

}
