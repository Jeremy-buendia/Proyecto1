package unidad3;

import java.util.Arrays;

public class Avion {

	private String id;
	private String nombre;
	private String modelo;
	private double peso;
	private double longitud;
	private String aeropuerto;
	public int numPasajeros;

	Pasajero listaPasajeros[];

	/**
	 * h
	 */
	public Avion() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param nombre
	 * @param modelo
	 * @param peso
	 * @param longitud
	 * @param aeropuerto
	 * @param numPasajeros
	 * @param listaPasajeros
	 */
	public Avion(String id, String nombre, String modelo, double peso, double longitud, String aeropuerto,
			int numPasajeros, Pasajero[] listaPasajeros) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.modelo = modelo;
		this.peso = peso;
		this.longitud = longitud;
		this.aeropuerto = aeropuerto;
		this.numPasajeros = numPasajeros;
		this.listaPasajeros = listaPasajeros;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public String getAeropuerto() {
		return aeropuerto;
	}

	public void setAeropuerto(String aeropuerto) {
		this.aeropuerto = aeropuerto;
	}

	public int getNumPasajeros() {
		return numPasajeros;
	}

	public void setNumPasajeros(int numPasajeros) {
		this.numPasajeros = numPasajeros;
	}

	public Pasajero[] getListaPasajeros() {
		return listaPasajeros;
	}

	public void setListaPasajeros(Pasajero[] listaPasajeros) {
		this.listaPasajeros = listaPasajeros;
	}

	@Override
	public String toString() {
		return "Avion [id=" + id + ", nombre=" + nombre + ", modelo=" + modelo + ", peso=" + peso + ", longitud="
				+ longitud + ", aeropuerto=" + aeropuerto + ", numPasajeros=" + numPasajeros + ", listaPasajeros="
				+ Arrays.toString(listaPasajeros) + "]";
	}

	/**
	 * Devuelve la cantidad de pasajeros que hay en el array
	 * 
	 * @return numero de pasajeros
	 */
	public int numPasajeros() {
		return this.listaPasajeros.length;
	}

	public int numPasajeros(int edad) {
		int cantPasajeros = 0;

		// Recorremos el array desde la posicion 0 hasta la length-1(ultima)
		// Con un for y utilizamos una variable i para ir recorriendo las posiciones
		for (int i = 0; i <= this.listaPasajeros.length - 1; i++) {
			// Si el pasajero actual en la posicion i su edad es mayor o igual a la
			// introducida como parametro, incrementamos el contador
			if (listaPasajeros[i].getEdad() >= edad)
				cantPasajeros++;
		}
		// Devolvemos el contador
		return cantPasajeros;

	}

	public float edadMedia() {

		double sumaEdad = 0;

		// Recorremos el array desde la posicion 0 hasta la length-1(ultima)
		// Con un for y utilizamos una variable i para ir recorriendo las posiciones
		for (int i = 0; i <= this.listaPasajeros.length - 1; i++) {
			// Vamos sumando la edad de todos los pasajeros de la lista
			sumaEdad = sumaEdad + this.listaPasajeros[i].getEdad();

		}

		return (float) (sumaEdad / this.listaPasajeros.length);

	}

	public int eliminarPasajero(String nif) {
		// Creamos un pasajero con nombre vacio
		Pasajero vacio = new Pasajero(1, "vacio", "vacio", 1, 'M', "1", "", false);

		// Recorremos el array desde la posicion 0 hasta la length-1(ultima)
		// Con un for y utilizamos una variable i para ir recorriendo las posiciones
		for (int i = 0; i <= this.listaPasajeros.length - 1; i++) {

			// Si el pasajero en la posicion i su nif coincide, insertamos
			// En esa posicion el pasajero vacio y salimos de la funcion
			if (nif.equals(this.listaPasajeros[i].getNif())) {
				listaPasajeros[i] = vacio;
				return 1;
			}

		}
		// Si llega aqui implica que no hay un pasajero con ese nif
		// en la lista de pasajeros y devolvemos 0
		return 0;
	}

}