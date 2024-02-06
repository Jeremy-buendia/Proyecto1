package unidad2condicionales;

public class Ejemplo8FuncionesCadenas {
	public static void main(String[] args) {
		String direccion = "Calle gorgola 23 23456 burgos Spain";
		String memRam = "8192MB";
		int dobleMemoria = 0;

		// Ejemplo funcion charAt, con ella podemos sacar el caracter en la posición
		// indicada
		char quintaPosicion = direccion.charAt(4);
		System.out.println(quintaPosicion);

		// la funcion substring devuelve un corte de la cadena original sobre la que
		// ejecutamos la funcion, hay que poner la posicion inicial y la final
		System.out.println("La calle es: " + direccion.substring(6, 13));

		// La propiedad length nos dice cuantos caracteres tiene el String
		System.out.println("La dirección tiene " + direccion.length() + " caracteres");

		// Cortamos el numero de la memoria ram
		memRam = memRam.substring(0, 4);

		// Convertir String en Int
		// Existe parseDouble y parseFloat
		dobleMemoria = Integer.parseInt(memRam) * 2;

		// Para convertir un numero a String se usa Value Of
		memRam = String.valueOf(dobleMemoria);

		// añade contenido
		direccion.concat(" Mundo");

		// Quita los espacios en blanco al final del String
		direccion = direccion.strip();

		// Quita los espacios en blanco al principio y al final del String
		direccion = direccion.trim();
	}
}
