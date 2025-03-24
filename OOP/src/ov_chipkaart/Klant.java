package ov_chipkaart;

public class Klant {
	
	
	    private String naam;
	    private double saldo;

	    public Klant(String naam, double saldo) {
	        this.naam = naam;
	        this.saldo = saldo;
	    }

	    public String getNaam() {
	        return naam;
	    }

	    public double getSaldo() {
	        return saldo;
	    }

	    public void setSaldo(double saldo) {
	        this.saldo = saldo;
	    }
	}
	

