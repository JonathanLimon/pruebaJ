package JUnit;

public class Metodos {
	public boolean esPar(int a) {
		boolean par = true;
		if (a % 2 == 0) {
			par = true;
		} else {
			par = false;
		}
		return par;
	}

	public int esMayor(int a, int b) {
		int mayor = 0;
		if (a > b) {
			mayor = a;
		} else {
			mayor = b;
		}
		return mayor;
	}

	public boolean esPrimo(int a) {
		boolean primo = true;
		if (a == 0 || a == 1) {
			primo = false;
		} else {
			for (int i = 2; i <= (a / 3); i++) {
				if (a % i == 0) {
					primo = false;
				}
			}
		}
		return primo;
	}

	public int suma(int a, int b) {
		int resultado = a + b;
		return resultado;

	}

	public int resta(int a, int b) {
		int resultado = a - b;
		return resultado;

	}

	public int multi(int a, int b) {
		int resultado = a * b;
		return resultado;

	}

	public double divi(double a, double b) {
		double resultado = 0;
		if (b == 0) {
			return -1;
		} else {
			resultado = a / b;
			return resultado;
		}

	}
}
