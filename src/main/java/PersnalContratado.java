public class PersnalContratado extends Persona {
	private String fechaIncorporacion;

	public PersnalContratado(String nombre, String rut, String estadoCivil, String fechaIncorporacion) {
		super(nombre, rut, estadoCivil);
		this.fechaIncorporacion = fechaIncorporacion;
	}

	public String getFechaIncorporacion() {
		return this.fechaIncorporacion;
	}

	public void setFechaIncorporacion(String fechaIncorporacion) {
		this.fechaIncorporacion = fechaIncorporacion;
	}
}