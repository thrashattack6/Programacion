import javax.swing.*;
public class Ejercicios_java8_diasemana {

	public static void main(String[] args) {
		
		String dia=JOptionPane.showInputDialog("Introduce un día de la semana");
		
		switch (dia) { // Valora el dia que se pone y entra en el case correspondiente
		
			case "Lunes":
			case "lunes":
			case "martes":
			case "Martes":
			case "Miercoles":
			case "miercoles":
			case "Miércoles":
			case "miércoles":
			case "jueves":
			case "Jueves":
			case "viernes":
			case "Viernes":
					System.out.println("El " + dia + " es laborable.");
			
			break;
			
			case "sabado":
			case "Sábado":
			case "sábado":
			case "Sabado":
			case "domingo":
			case "Domingo":
				System.out.println("El " + dia + " no es laborable.");
			
			default:
				System.out.println("Introduce un día de la semana");
		}
	}
}