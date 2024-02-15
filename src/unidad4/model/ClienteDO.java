package unidad4.model;

public class ClienteDO {
	private int idCliente;
	private String nombre;
	private String apellidos;
	private int edad;
	private char sexo;
	private String email;
	private String password;

	/**
	 * 
	 * @param idCliente
	 * @param nombre
	 * @param apellido
	 * @param edad
	 * @param sexo
	 * @param email
	 * @param password
	 */
	public ClienteDO(int idCliente, String nombre, String apellidos, int edad, char sexo, String email,
			String password) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.sexo = sexo;
		this.email = email;
		this.password = password;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "ClienteDO [idCliente=" + idCliente + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad="
				+ edad + ", sexo=" + sexo + ", email=" + email + ", password=" + password + "]";
	}

}
