import javax.swing.*;
public class Ejercicios_java2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String radio=JOptionPane.showInputDialog("Introduce el radio, por favor");
		
		double radio_conv = Double.parseDouble(radio);
		
		System.out.print("El �rea de este c�rculo es " + 
		(Math.PI * Math.pow(radio_conv, 2)));
	}

}