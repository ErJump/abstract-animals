package org.animals;

public class Cane extends Animale{

	public Cane(String nome) {
		super(nome);
	}

	@Override
	public void verso() {
		System.out.println("bau bau");
	}

	@Override
	public void mangia() {
		System.out.println("onnivoro");
	}

}
