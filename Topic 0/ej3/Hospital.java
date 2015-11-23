package ej3;

import java.util.*;

public class Hospital {
	private List<Integer> Pacientes;
	private Integer HabitacionesLibres;
	private Integer HabitacionesOcupadas;
	private Integer Medicos;
	
	public void SetHabitaciones(int n){
		this.HabitacionesLibres=n;
		this.HabitacionesOcupadas=0;
		ArrayList<Integer> aux=new ArrayList<Integer>(n);
		for(int i=0;i<n;i++)
			aux.add(-1);
		this.Pacientes=aux;
	}
	
	public void SetMedicos(int n){
		this.Medicos=n;
	}
	
	public List<Integer> GetPacientes(){
		return Pacientes;
	}
	
	public Integer GetHLibres(){
		return HabitacionesLibres;
	}
	
	public Integer GetHOcupadas(){
		return HabitacionesOcupadas;
	}
	
	public Integer GetMedicos(){
		return Medicos;
	}
}
