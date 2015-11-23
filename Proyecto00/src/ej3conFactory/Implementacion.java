package ej3conFactory;

public class Implementacion {
	public static void main(String[] args) {
		HospitalFactory hospitalFactory = new HospitalFactory();
		
		Hospital h1 = hospitalFactory.getHospital("oftalmologico"){
			System.out.println(tipo);
		}
		
		Hospital h2 = hospitalFactory.getHospital("odontologico"){
			System.out.println(tipo);
		}
	}

}
