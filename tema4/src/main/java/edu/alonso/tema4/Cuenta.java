package edu.alonso.tema4;

public class Cuenta {	
	private String titular;
	private String iban;
	private double dinero;
	
		public Cuenta(String titular, String iban, double dinero) {
		this.titular=titular;
		this.iban=iban;
		this.dinero=dinero;
		}

		public String getTitular() {
			return titular;
		}

		public void setTitular(String titular) {
			this.titular = titular;
		}

		

		public String getIban() {
			return iban;
		}

		public void setIban(String iban) {
			this.iban = iban;
		}

		public double getDinero() {
			return dinero;
		}

		public void setDinero(double dinero) {
			this.dinero = dinero;
		}
		@Override
		public String toString() {
			return "Cuenta [titular=" + titular + ", iban=" + iban + ", dinero=" + dinero + "]";
		}


}
	

