import java.util.Scanner;
public class Video9_Entrada_ejemplo1 {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce tu nombre, por favor");
		
		String nombre_usuario=entrada.nextLine();
		
		System.out.println("Introduce tu edad, por favor");
		
		int edad=entrada.nextInt();
		
		System.out.println("Hola " + nombre_usuario + ". El a�o que viene tendr�s " + (edad+1) + " a�os.");
	}
}
