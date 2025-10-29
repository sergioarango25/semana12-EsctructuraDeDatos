// Realiace una implimentacion que realice la suma de 1 al numero pasado por parametro
// suma de 1 a num

public class Recursividad {

    public static int sumaHasta(int num) {
        int suma = 0;
        for (int i = 1; i <= num; i++) {
            suma += i;
        }
        return suma;
    }

    public static void main(String[] args) {
        int numero = 5;
        int resultado = sumaHasta(numero);
        System.out.println("La suma de 1 hasta " + numero + " es: " + resultado);
    }
}
