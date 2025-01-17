package edu.alonso.tema4;

public class Init {

	public static void main(String[] args) {
		
		Calcetin [][] kullen = new Calcetin[3][5];
		
		kullen[0][0] = new Calcetin("Nike", 40);
		kullen[0][1] = new Calcetin("Adidas", 42);
		kullen[0][2] = new Calcetin("Puma", 44);
		kullen[0][3] = new Calcetin("Tenth", 38);
		kullen[0][4] = new Calcetin("Gucci", 39);
		kullen[1][0] = new Calcetin("PieLuxe", 39);
		kullen[1][1] = new Calcetin("SensiSock", 35);
		kullen[1][2] = new Calcetin("TrendyFeet", 42);
		kullen[1][3] = new Calcetin("CalcetínZen", 34);
		kullen[1][4] = new Calcetin("Socktástico", 45);
		kullen[2][0] = new Calcetin("PisoMágico", 33);
		kullen[2][1] = new Calcetin("CalzaTrendy", 36);
		kullen[2][2] = new Calcetin("VivaSocks", 40);
		kullen[2][3] = new Calcetin("SoftStep", 42);
		kullen[2][4] = new Calcetin("Zócalo Comfort", 39);
		for (int i =0; i < kullen.length; i++) {
			System.out.println(kullen[i]);
		}
		System.out.println();
		
		kullen[2] = null;
		
		kullen[3].setMarca("Suprimoh");
		for (int i =0; i < kullen.length; i++) {
			System.out.println(kullen[i]);
		}
	}
}
