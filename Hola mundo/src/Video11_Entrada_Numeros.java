import javax.swing.*;
public class Video11_Entrada_Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//double x=10000.0;
		
		//System.out.printf("%1.2f", x/3);
		
		String num1=JOptionPane.showInputDialog("Introduzca un n�mero"); //Se introduce un valor a trav�s de JOptionPane
		
		double num2=Double.parseDouble(num1); //Se pasa a double el string en el que est� almacenado el n�mero
		
		System.out.print("La ra�z de " + Math.round(num2) + " es "); //Se muestra el n�mero redodeando
		
		System.out.printf("%1.2f", Math.sqrt(num2)); // Se calcula la raiz de ese n�mero
	}

}
