package ej3;

//creo el patron para crear hospital

public final class Hospital {
	String nombre;
	String tipo;
	double tamaño;
	int cant_medicos;
	
	private Hospital(String nombre, String tipo, double tamaño, int cant_medicos) {
			super();
			this.nombre = nombre;
			this.tipo = tipo;
			this.tamaño = tamaño;
			this.cant_medicos = cant_medicos;
		}
	
	private final static Hospital hospital = new Hospital("TeCuramos", "alta complejidad", 4000.2, 500);
	
	public static Hospital obtenerHospital(){
		return hospital;
	}
	
}
