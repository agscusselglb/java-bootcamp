package ej3;

public class ConstructorClinica implements ConstructorSalud {
	private Hospital clinica;
	
	public ConstructorClinica(){
		clinica=new Hospital();
	}
	@Override
	public void CrearHabitaciones() {
		clinica.SetHabitaciones(100);
	}

	@Override
	public void CrearMedicos() {
		clinica.SetMedicos(100);
	}

	@Override
	public Hospital CrearHospital() {
		return clinica;
	}

}
