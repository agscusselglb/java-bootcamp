package ej3;

public class DirectorHospital {
	private ConstructorSalud hospital=null;
	
	public DirectorHospital(ConstructorSalud h){
		hospital=h;
	}
	
	public void ConstHospital(){
		hospital.CrearHabitaciones();
		hospital.CrearMedicos();
	}
	
	public Hospital GetHospital(){
		return hospital.CrearHospital();
	}
}
