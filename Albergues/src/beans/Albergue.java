package beans;

public class Albergue {
	
	//BEAN ALBERGUE
	private String tipo;
	private String nombre;
	private String direccion;
	private int codigoPostal;
	private String provincia;
	private String municipio;
	private String localidad;
	private String nucleo;
	private String[] telefonos = new String[3];
	private String fax;
	private String email;
	private String web;
	private String QCalidad;
	private String centralReservas;
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getNucleo() {
		return nucleo;
	}
	public void setNucleo(String nucleo) {
		this.nucleo = nucleo;
	}
	public String[] getTelefonos() {
		return telefonos;
	}
	public void setTelefonos(String[] telefonos) {
		this.telefonos = telefonos;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	public String getQCalidad() {
		return QCalidad;
	}
	public void setQCalidad(String qCalidad) {
		QCalidad = qCalidad;
	}
	public String getCentralReservas() {
		return centralReservas;
	}
	public void setCentralReservas(String centralReservas) {
		this.centralReservas = centralReservas;
	}
	
}
