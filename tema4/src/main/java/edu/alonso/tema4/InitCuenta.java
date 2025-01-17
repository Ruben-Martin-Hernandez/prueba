package edu.alonso.tema4;

public class InitCuenta {

	public static void main(String[] args) {
		
		Cuenta kullen[] = new Cuenta[3];
		kullen[0] = new Cuenta("Pepe", "ES8730048117043548498227",100000000);
		kullen[1] = new Cuenta("Juan", "ES4314656954346447865396",6478356);
		kullen[2] = new Cuenta("Hector", "ES6504871654117187949847",7);
		
		for (Cuenta item : kullen) {
			if (item.getDinero()>=1000000) {
				item.setDinero(item.getDinero()* 1.01);
			}
			System.out.println(item);
		}
		
	}

}
