import javax.swing.*;
public class Ejercicios_java5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String radio=JOptionPane.showInputDialog("Introduce el radio, por favor");
		
		double radio_conv = Double.parseDouble(radio);

		double volumen=4*Math.PI*Math.pow(radio_conv, 3)/3;
		
		double superficie=4*Math.PI*Math.pow(radio_conv, 2);
		
		System.out.printf("El volumen de la esfera es " + "%1.2f",(volumen));
		
		System.out.printf(" y la superficie es " + "%1.2f",(superficie));
		
	}
}