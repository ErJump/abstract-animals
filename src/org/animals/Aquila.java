package org.animals;

public class Aquila extends Animale implements IVolante{

	public Aquila(String nome) {
		super(nome);
	}

	@Override
	public void verso() {
		System.out.println("screeeeech");
	}

	@Override
	public void mangia() {
		System.out.println("carne");
	}

	@Override
	public void vola() {
		System.out.println("vola!");
	}

}
