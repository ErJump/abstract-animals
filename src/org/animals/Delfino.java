package org.animals;

public class Delfino extends Animale{

	public Delfino(String nome) {
		super(nome);
	}

	@Override
	public void verso() {
		System.out.println("So long, and Thanks for All the Fish!");
	}

	@Override
	public void mangia() {
		System.out.println("Pesce, crostacei, calamari");
	}

}
