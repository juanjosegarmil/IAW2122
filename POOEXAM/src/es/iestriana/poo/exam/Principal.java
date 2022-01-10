package es.iestriana.poo.exam;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Regalos r1 = new Regalos("c1", "ferrari", 2021, 100000, true, "coche");
		Regalos r2 = new Regalos("oso", "nose", 1989, 20, false, "oso");
		
		r1.cambiarExistencias(r1);
		System.out.println(r1);
		r2.cambiarTipo(r2, "playmovil");
		System.out.println(r2);
		r2.incrementarPrecio(r2, 0.5);
		System.out.println(r2);
		r1.comprobarRegalo(r1);
	}

}
