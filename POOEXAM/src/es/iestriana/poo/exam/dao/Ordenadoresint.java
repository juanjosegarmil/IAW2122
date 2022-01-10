package es.iestriana.poo.exam.dao;

import es.iestriana.poo.exam.bean.Ordenadores;

public interface Ordenadoresint {

	public void añadirOrdenador(Ordenadores o);
	
	public void borrarOrdenadores();
	
	public void borrarOrdenadoresAnyo();
	
	public void buscarOrdenador(String marca, int ram, String procesador);
	
	public void buscarRamEstado(int ram);
	
	public Ordenadores actualizarRam(int ram);
	
	public void listarOrdenadores();
}

