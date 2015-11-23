package ej3;

public class FabricaHospital {
	public Hospital FHospital(String s){
		if(s.equals("Clinica")){
			ConstructorSalud h=new ConstructorClinica();
			DirectorHospital d=new DirectorHospital(h);
			d.ConstHospital();
			return d.GetHospital();
		}
		else{
			ConstructorSalud h=new ConstructorHospital();
			DirectorHospital d=new DirectorHospital(h);
			d.ConstHospital();
			return d.GetHospital();
		}
	}
}
