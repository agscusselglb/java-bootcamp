package ej2;

public class Vivienda {
	String calle;
	int altura;
	String color;
	double tamaño;
	String tipo_vivienda;
	
	//constructor
	public Vivienda(String calle, int altura, String color, double tamaño, String tipo_vivienda){
		this.calle=calle;
		this.altura=altura;
		this.color=color;
		this.tamaño=tamaño;
		this.tipo_vivienda=tipo_vivienda;
	}
	
	//objeto con la implementacion del constructor
	Vivienda v1 = new Vivienda("Salcedo", 3193, "celeste", 3002.4, "casa");
	
	System.out.println(v1);
}
