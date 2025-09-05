package Streams;

public class Test {

	public static void main(String[] args) {

		Game g1=new Game();
		Game g2=new Game();
		
		g1.display();
		g2.display();
		
		System.out.println(g1.equals(g2));
	}

}
