public class interar {

	public static int factorial(int num){
		int multiplicacion = 1; 
		for (int i = 1; i <= num; i++){
			multiplicacion *= i;
		}
		return multiplicacion;
	}

	public static void main(String[] args) {
		int numero = 5;
		int resultado = factorial(numero);
		System.out.print("Factorial de " + numero + " es " + resultado);
	}
}
