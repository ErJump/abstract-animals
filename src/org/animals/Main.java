package org.animals;

public class Main {
	public static void main(String[] args) {
		Cane c = new Cane("Dalmata");
		c.dormi();
		c.mangia();
		c.verso();
		
		System.out.println("-------------");
		
		Passerotto p = new Passerotto("Domesticus");
		p.dormi();
		p.mangia();
		p.verso();
		
		System.out.println("-------------");
		
		Aquila a = new Aquila("Reale");
		a.dormi();
		a.mangia();
		a.verso();
		
		System.out.println("-------------");
		
		Delfino d = new Delfino("Flipper");
		d.dormi();
		d.mangia();
		d.verso();
	}
}
