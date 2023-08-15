package view;

import controller.DivSub;

public class Principal {

	public static void main(String[] args) {
		DivSub ds = new DivSub();
		
		int a = 13;
		int b = 10;
		
		int fatsub = ds.fatsub(a, b);
		System.out.println(+fatsub);
	}

}
