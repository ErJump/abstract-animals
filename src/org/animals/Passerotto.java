package org.animals;

public class Passerotto extends Animale implements IVolante {

	public Passerotto(String nome) {
		super(nome);
	}

	@Override
	public void verso() {
		System.out.println("cip cip");
	}

	@Override
	public void mangia() {
		System.out.println("frutta, semi, insetti");
	}

	@Override
	public void vola() {
		System.out.println("vola!");
	}
	
}
