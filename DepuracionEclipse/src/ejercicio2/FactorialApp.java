package ejercicio2;

public class FactorialApp {
	public static void main(String[] args) {
		int numero = 5;
		int resultado = factorial(numero);
		if (resultado != -1) {
			System.out.println("El factorial de " + numero + " es " + resultado);
		}
	}

	public static int factorial(int n) {
		if (n < 0) {
			System.out.println("Error: no existe el factorial de un número negativo.");
			return -1;
		}

		if (n == 0) {
			return 1;
		}

		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}
}