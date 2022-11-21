public class Persona {
	private String nombre;
	private String rut;
	private String estadoCivil;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	public void seEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Persona(String nombre, String rut, String estadoCivil) {
		this.nombre = nombre;
		this.rut = rut;
		this.estadoCivil = estadoCivil;
	}
}