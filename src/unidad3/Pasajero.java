package unidad3;

public class Pasajero {

	// definimos las variables miembro de la clase

	private int identificador;
	private String nombre;
	private String apellidos;
	private int edad;
	private char sexo;
	private String nif;
	private String clase;
	private boolean vip;

	public Pasajero() {
		this.identificador = (int) (Math.random() * 1000);
		this.nombre = "";
		this.apellidos = "";
		this.edad = (int) (Math.random() * 120);
		this.sexo = (Math.random() > 0.5 ? 'F' : 'M');
		this.nif = "";
		this.clase = "";
		this.vip = (Math.random() > 0.9 ? true : false);
	}

	/**
	 * @param identificador
	 * @param nombre
	 * @param apellidos
	 * @param edad
	 * @param sexo
	 * @param nif
	 * @param clase
	 * @param vip
	 */
	public Pasajero(int identificador, String nombre, String apellidos, int edad, char sexo, String nif, String clase,
			boolean vip) {
		super();
		this.identificador = identificador;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.sexo = sexo;
		this.nif = nif;
		this.clase = clase;
		this.vip = vip;
	}

	// get y sets

	public int getIdentificador() {
		return this.identificador;
	}

	public void setIdentificador(int valIdentificador) {
		this.identificador = valIdentificador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}

	@Override
	public String toString() {

		String salida = "Pasajero " + this.nombre + " \n ***************************** \n";
		salida += "nombre=" + nombre + "\n";
		salida += "apellidos=" + apellidos + "\n";
		salida += "edad=" + edad + "\n";
		salida += "sexo=" + sexo + "\n";
		salida += "nif=" + nif + "\n";
		salida += "clase=" + clase + "\n";
		salida += "vip=" + vip + "\n";

		return salida;

	}

}