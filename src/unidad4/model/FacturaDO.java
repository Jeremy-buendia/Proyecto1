package unidad4.model;

public class FacturaDO {
	private int idFactura;
	private String cif;
	private String nombreEmpresa;
	private int idCliente;

	public FacturaDO(int idFactura, String cif, String nombreEmpresa, int idCliente) {
		super();
		this.idFactura = idFactura;
		this.cif = cif;
		this.nombreEmpresa = nombreEmpresa;
		this.idCliente = idCliente;
	}

	public int getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

}
