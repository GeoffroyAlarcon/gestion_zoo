package fr.demos.models;

public class Oiseau extends Animal {
	String cri = "cui cui";

	public Oiseau(String name, boolean vivant, int age) {
		super(name, vivant, age);
		this.setAgeMaxi(10);
	}

	public String getCri() {
		return cri;
	}

	public void setCri(String cri) {
		this.cri = cri;
	}

	public void vieillir() {

		if (this.isVivant() == false) {
			System.out.println(getName() + " est décédé");

		}

		else {
			this.setAge(this.getAge() + 2);
		}
		if (getAge() >= getAgeMaxi()) {
			System.out.println(getName() + " vient de mourir");
			this.setVivant(false);
		}
	}

	public void crier() {
		if (this.isVivant() == false) {
			System.out.println(getName() + "rest muet...");
			this.setVivant(false);
		}

		else {
			System.out.println(cri);
		}
	}
}
