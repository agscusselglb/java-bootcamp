package ej3;

public class ConstructorHospital implements ConstructorSalud {
	private Hospital Hospital;
	
	public ConstructorHospital(){
		Hospital=new Hospital();
	}
	@Override
	public void CrearHabitaciones() {
		Hospital.SetHabitaciones(200);
	}

	@Override
	public void CrearMedicos() {
		Hospital.SetMedicos(200);
	}

	@Override
	public Hospital CrearHospital() {
		return Hospital;
	}

}
