
import java.util.Scanner;
public class Ejercicios_java {
	

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce tu nombre");
		String nombre=sc.nextLine();
		
		System.out.println("Bienvenido " + nombre);
		
	}
}
