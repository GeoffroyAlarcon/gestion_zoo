package fr.demos.models;

import java.awt.Point;
import java.util.Scanner;


public class Singe extends Animal {
	String cri;

	public Singe(String name, boolean vivant, int age) {
		super(name, vivant, age);

		this.setAgeMaxi(20);
	}

	public void vieillir() {

		if (this.isVivant() == false) {
			System.out.println(getName() + " est décédé");

		}

		else {
			this.setAge(this.getAge() + 1);
		}
		if (getAge() >= getAgeMaxi()) {
			System.out.println(getName() + " vient de mourir");
			this.setVivant(false);
		}
	}

	public void crier() {
		if (this.isVivant() == false) {
			System.out.println(getName() + " reste muet");

		}

		else {
			System.out.println(cri);
			System.out.println(" rentrer une phrase que dit le singe ");
			Scanner sc = new Scanner(System.in);

			cri = sc.nextLine();

			System.out.println(cri);
		}
	}

}
