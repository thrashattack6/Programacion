import javax.swing.*;
public class Ejercicios_java8_diasemana {

	public static void main(String[] args) {
		
		String dia=JOptionPane.showInputDialog("Introduce un d�a de la semana");
		
		switch (dia) { // Valora el dia que se pone y entra en el case correspondiente
		
			case "Lunes":
			case "lunes":
			case "martes":
			case "Martes":
			case "Miercoles":
			case "miercoles":
			case "Mi�rcoles":
			case "mi�rcoles":
			case "jueves":
			case "Jueves":
			case "viernes":
			case "Viernes":
					System.out.println("El " + dia + " es laborable.");
			
			break;
			
			case "sabado":
			case "S�bado":
			case "s�bado":
			case "Sabado":
			case "domingo":
			case "Domingo":
				System.out.println("El " + dia + " no es laborable.");
			
			default:
				System.out.println("Introduce un d�a de la semana");
		}
	}
}