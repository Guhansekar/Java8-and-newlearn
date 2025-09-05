package SortingEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import SortingEx.Mobile2.Brand;

public class UseComparator {
	public static List<Mobile2> mobiles=new ArrayList<Mobile2>();

	public static void main(String[] args) {
		Mobile2 m1=new Mobile2(Brand.APPLE, "15", "64mb", "5000mah", 90000);
		Mobile2 m2=new Mobile2(Brand.REDMI,"note8","48mb","4000mah",12000);
		Mobile2 m3=new Mobile2(Brand.REDMI,"note7","48mb","4000mah",11000);
		Mobile2 m4=new Mobile2(Brand.REDMI,"12c","50mb","5000mah",8500);
		Mobile2 m5=new Mobile2(Brand.OPPO,"44","50mb","5000mah",45000);
		
		mobiles=Arrays.asList(m1,m2,m3,m4,m5);
		System.out.println("before sorting comparator...");
		display();
		System.out.println("after sorting comparator...");
		Collections.sort(mobiles,new ComparEx());
		display2();
	}

	public static void display() {
		System.out.printf("| %-15s| %-15s| %-15s| %-15s| %-15s|%n","Brand","Model","Camera","Battery","Price");
		
		for(Mobile2 m:mobiles) {
			System.out.printf("| %-15s| %-15s| %-15s| %-15s| %-15d|%n",m.getBrand(),m.getModel(),m.getCamera(),m.getBattery(),m.getPrice());
		}
	}
	public static void display2() {
		

		System.out.printf("| %-15s| %-15s| %-15s| %-15s| %-15s|%n","Brand","Model","Camera","Battery","Price");
		
		for(Mobile2 m:mobiles) {
			System.out.printf("| %-15s| %-15s| %-15s| %-15s| %-15d|%n",m.getBrand(),m.getModel(),m.getCamera(),m.getBattery(),m.getPrice());
		}
	}
}
