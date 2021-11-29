package es.iestriana.poo.datos;

public class Principal {

	public static void main(String[] args) {
		Cuentas c1 = new Cuentas();
		Cuentas c2 = new Cuentas("Juan José", "3898038333", 20302903, 3.5);
		
		c1.setNombre("canelo");
		c1.setSaldo(342323);
		c1.setCcc("2334344545345");
		c1.setTipoDeInteres(2.4);
		
		c1.ingresar(10000);
		c2.reintegro(3000);
		
		System.out.println(c1);
		System.out.println(c2);
	}

}
