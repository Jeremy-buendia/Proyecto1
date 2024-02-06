package unidad1;

//para importar el escaner
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejemplo4Lectura {
	public static void main(String[] args) {
		
		//variables
		String nombre = "";
		int edad = 0;
		String clase = "";
		
		//leemos con una ventana modal la clase utilizando la funcion showInputDialog
		clase = JOptionPane.showInputDialog(null, "Clase: ","Introduce Datos", JOptionPane.QUESTION_MESSAGE);
		
		//Creamos un objeto Scanner para leer de teclado
		Scanner teclado = new Scanner(System.in);
		
		//pedimos el nombre
		System.out.print("Introduce tu nombre: ");
		
		//Leemos por teclado un string con nextLine de Scanner
		nombre = teclado.nextLine();
		
		System.out.print("Introduce tu edad: ");
		//Leemos por teclado un numero con nextInt de Scanner
		edad = teclado.nextInt();
		
		System.out.println("Hola " + nombre + ", eres de la clase " + clase + ", bienvenido a Java. Tu edad es de " + edad + " años.");
		
		//Cerramos el teclado para que no ocupe memoria
		teclado.close();
		
		
	}
}
