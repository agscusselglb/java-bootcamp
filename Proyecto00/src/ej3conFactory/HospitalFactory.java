package ej3conFactory;

public class HospitalFactory {

		public Hospital getHospital(String Tipo){
			if ("oftalmologico".equals(Tipo))
				return new Oftalmologico();
			}else{
				return new Odontologico();
		}
	

}
