package Streams;

import java.util.Arrays;
import java.util.List;

public class ReduceEx {

	public static void main(String[] args) {

		List<Integer> names=Arrays.asList(1,2,3,4,5,6);
		
		int num=names.stream().reduce(10,(sum,nums)->sum+nums);
		
		System.out.println(num);
	}

}
