package ej2;

import java.util.*;

public class Casa {
	private List<Integer> Habitaciones;
	private Integer Cocina;
	private Integer Baño;
	private Integer Patio;
	
	public void SetHabitaciones(List<Integer> H){
		this.Habitaciones=new ArrayList<Integer>(H);
	}
	
	public List<Integer> GetHabitaciones(){
		return Habitaciones;
	}
	
	public void SetCocina(Integer C){
		this.Cocina=C;
	}
	
	public Integer GetCocina(){
		return Cocina;
	}
	
	public void SetBaño(Integer B){
		this.Baño=B;
	}
	
	public Integer GetBaño(){
		return Baño;
	}
	
	public void SetPatio(Integer P){
		this.Patio=P;
	}
	
	public Integer GetPatio(){
		return Patio;
	}
}
