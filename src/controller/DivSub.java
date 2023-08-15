package controller;

public class DivSub {

	public DivSub() {
		super();
	}
	public int fatsub(int a, int b) {
		// se o fator "b" for maior q o fator "a", o "a" será o resto. 
		if (a < b) {
			return a;
		} else {
			a = a - b;
			//realiza a operação de "a-b" até que o criterio de parada seja atingido
			return fatsub(a, b);
		}
	}
}
/*
 * Recebe dois fatores. 6 e 2. Subtrai 6-2 = 4; 4-2 = 2; 2-2 = 0;
 */
