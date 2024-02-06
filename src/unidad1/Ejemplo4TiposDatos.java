package unidad1;

public class Ejemplo4TiposDatos {
	
	/*
	 *Vamos a leer por teclado variables de todos los tipos de datos primitivos
	 *de Java y lo mostraremos por pantalla
	*/
	
	public static void main(String[] args) {
		
		//Tipos de datos
		byte edad = 23;
		short día = 23;
		int numAlum = 238;
		float notaMedia = 9.98f;
		double pi = 3.141594435424;
		boolean mEdad = true; //o false
		char letraPuerta = 'B';
		String telefono = "(0034) - 666666666";
		
		//color pelo
		String colorPelo = "red";
		//tipo pelo
		String tipoPelo = "curly";
		//edad
		byte edadP = 19;
		//puntos vida
		int PE = 1000;
		//peso
		float weight = 80.7f;
		//ataque
		int ataque = 190;
		//esNoMuerto
		boolean esNoMuerto = true;
		//puntos magia
		int magia = 700;
		//nivel personaje
		int nivel = 1;
		
		//subida de nivel
		nivel = nivel + 1;
		
		System.out.println(nivel++);
		//Si ponemos el operador ++ antes de la variable primerose incrementa el valor y luego
		//se ejecuta el resto de operadores/instrucciones.
		System.out.println(++nivel);
		
		nivel++; //++ incrementa en una ud.
		
		
		
		System.out.println();
		
		//incremento de vida por su vida de nivel
		PE = PE + 10;
		PE += 10;
		


	}
}
