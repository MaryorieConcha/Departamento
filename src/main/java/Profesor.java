public class Profesor extends PersnalContratado {
	public Departamento departamento;
	public Asignatura asignatura;

	public Profesor(String nombre, String rut, String estadoCivil, String fechaIncorporacion) {
		super(nombre, rut, estadoCivil, fechaIncorporacion);
	}
}