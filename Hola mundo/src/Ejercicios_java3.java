import javax.swing.*;
public class Ejercicios_java3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String palabra=JOptionPane.showInputDialog("Introduce la primera palabra, por favor");
		
		String palabra2=JOptionPane.showInputDialog("Introduce la segunda palabra, por favor");
		
		if(palabra.equals(palabra2)) {
			System.out.println("Coincide");}
		else {
			System.out.println("No coincide");
		}
	}
}