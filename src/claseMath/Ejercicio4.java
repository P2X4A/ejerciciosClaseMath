package claseMath;

public class Ejercicio4 {

	public static void main(String[] args) {
		//El double es redundante, el metodo Math.random ya devuelve un double
		double numeroDecimal1 = (double) (Math.random() *50);
		double numeroDecimal2 = (double) (Math.random() *50);
		int resultadoDecimal1 = (int) (Math.round(numeroDecimal1));
		int resultadoDecimal2 = (int) (Math.round(numeroDecimal2));
		
		int numeroMaximo = (int) (Math.max(resultadoDecimal1, resultadoDecimal2));
		System.out.println("El resultado es:" + numeroMaximo);

	}

}
