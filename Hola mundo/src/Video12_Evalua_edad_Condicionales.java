import java.util.*;
public class Video12_Evalua_edad_Condicionales {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce tu edad, por favor");
		
		int edad=entrada.nextInt();
		
		//if(edad>=18) {
			
		//	System.out.println("Eres mayor de edad");
		//}
		//else {
		//	System.out.println("No eres mayor de edad");
		//}
		
		if (edad<18) {
			
			System.out.println("Eres adolescente");
		}
		
		else if(edad<40) {
			System.out.println("Eres joven");
		}
		
		else if(edad<65) {
			System.out.println("Eres maduro");
		}
		
		else {
			System.out.println("Cuidate");
		}
	}
}
