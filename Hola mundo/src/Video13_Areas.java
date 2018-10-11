import java.util.*;
import javax.swing.*;
public class Video13_Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Elige una opci�n: \n1: Cuadrado \n2: Rect�ngulo \n3: Tri�ngulo \n4: C�rculo");
		
		int figura=entrada.nextInt();
		
		switch (figura) { // Valora el n�mero que se pone y entra en el case correspondiente
		
		case 1: 
			
			int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado: "));
			
			System.out.println("El �rea del cuadrado es " + Math.pow(lado, 2));
			
			break; // Sirve para romper el case y evitar fallos
			
		case 2:
			
			int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura: "));
			
			int base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base: "));
			
			System.out.println("El �rea del rect�ngulo es " + altura*base);
			
			break;
		
		case 3:
			
			base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base: "));
			
			altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura: "));
			
			System.out.println("El �rea del tri�ngulo es " + (altura*base)/2);
			
			break;
			
		case 4:
			
			int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio: "));
			
			System.out.print("El �rea del c�rculo es ");
			
			System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
			
			break;
			
		default:
			
			System.out.println("La opci�n no es correcta");
		}		
	}
}
