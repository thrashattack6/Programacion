import java.util.*;
public class Ejercicios_java6 {
		
	public static void main(String[] args) {
		
		// Introducir los datos con comas en vez de puntos.
		
		Scanner entrada_peso=new Scanner(System.in);
		
		System.out.println("Introduce tu peso en kg, por favor");
		
		double peso=entrada_peso.nextDouble();
		
		Scanner entrada_altura=new Scanner(System.in);
		
		System.out.println("Introduce tu altura en metros, por favor");
		
		double altura=entrada_altura.nextDouble();
		
		double imc=peso/(Math.pow(altura, 2));
		
		System.out.printf("Tu IMC es " + "%1.2f",(imc));
		
	}
}
