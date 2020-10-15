package fr.demos.services;

import java.util.ArrayList;

import fr.demos.models.Animal;

public class AnimalService {
	private ArrayList<Animal> tableauAnimal = new ArrayList();
	private String directeur;

	public AnimalService(ArrayList<Animal> tableauAnimal) {
		super();
		this.tableauAnimal = tableauAnimal;
	}

	public AnimalService() {
		super();
	}

	public void addAnimal(Animal animal) {
		tableauAnimal.add(animal);
	}

	public void feteAnniversaire() {

		for (int i = 0; i < tableauAnimal.size(); i++) {
			Animal findAnimal = tableauAnimal.get(i);

			findAnimal.vieillir();

		}
		for (int i = 0; i < tableauAnimal.size(); i++) {
			Animal findAnimal = tableauAnimal.get(i);

			if (findAnimal.isVivant() == false) {
				tableauAnimal.remove(findAnimal);
			}

		}
	}

	public ArrayList<Animal> findallAnimal() {
		return tableauAnimal;
	}

	public void crier() {

		for (int i = 0; i < tableauAnimal.size(); i++) {
			Animal findAnimal = tableauAnimal.get(i);

			findAnimal.crier();

		}
	}

	public void mourrir(Animal animal) {
		tableauAnimal.remove(animal);
		System.out.println(animal.getName() + "vient de mourrir !");
		animal.setVivant(false);
	}

	@Override
	public String toString() {
		return "AnimalService [tableauAnimals=" + tableauAnimal + "]";
	}

}
