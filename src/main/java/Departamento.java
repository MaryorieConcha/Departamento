public class Departamento {
	private String nombreDepto;
	public Profesor profesor;
	public Estudiante estudiante;
	public Administrativo administrativo;

	public String getNombreDepto() {
		return this.nombreDepto;
	}

	public void setNombreDepto(String nombreDepto) {
		this.nombreDepto = nombreDepto;
	}

}