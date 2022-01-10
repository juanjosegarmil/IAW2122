package es.iestriana.poo.exam.dao;

import java.util.ArrayList;
import java.util.List;

import es.iestriana.poo.exam.bean.Ordenadores;


public class Ordenadoresint2 implements Ordenadoresint{
  
	private List<Ordenadores> ordenador = new ArrayList<Ordenadores>();

	@Override
	public void añadirOrdenador(Ordenadores o) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ordenador.size(); i++) {
			if (ordenador.get(i) != o) {
				ordenador.add(o);
			}
		}
	}

	@Override
	public void borrarOrdenadores() {
		// TODO Auto-generated method stub
		ordenador.clear();
	}

	@Override
	public void borrarOrdenadoresAnyo() {
		// TODO Auto-generated method stub
		for (int i = 0; i < ordenador.size(); i++) {
			if (ordenador.get(i).getAnyocompra() < 2017 && ordenador.get(i).isFunciona() == false) {
				ordenador.set(i, null);
			}
		}
	}

	@Override
	public void buscarOrdenador(String marca, int ram, String procesador) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ordenador.size(); i++) {
			if (ordenador.get(i).getMarca().equalsIgnoreCase(marca) && ordenador.get(i).getRam() == ram && ordenador.get(i).getProcesador().equalsIgnoreCase(procesador)) {

				System.out.println(ordenador.get(i));
			}
		}
	}

	@Override
	public void buscarRamEstado(int ram) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ordenador.size(); i++) {
			if (ordenador.get(i).getRam() == ram &&  ordenador.get(i).isFunciona() == true) {
				System.out.println(ordenador.get(i)); 
			}
		}
	}

	public Ordenadores actualizarRam(int ram) {
		// TODO Auto-generated method stub
		for (Ordenadores o : ordenador) {
			if (o.getAnyocompra() == 2019) {
				o.setRam(ram);
			}
		}
		return null;
	}

	@Override
	public void listarOrdenadores() {
		// TODO Auto-generated method stub
		for (int i = 0; i < ordenador.size(); i++) {
			if (ordenador.get(i).isFunciona() == true && ordenador.get(i).getRam() == 512 && ordenador.get(i).getAnyocompra() == 2018) {
				System.out.println(i);
			}
		}
	}
}
