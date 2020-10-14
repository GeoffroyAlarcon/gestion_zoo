package fr.demos.services;

import java.util.ArrayList;

import fr.demos.models.Animal;

public class AnimalService {
	private ArrayList<Animal> tableauAnimal = new ArrayList();;
	private String directeur;

	public AnimalService(ArrayList<Animal> tableauAnimal) {
		super();
		this.tableauAnimal = tableauAnimal;
	}

	public AnimalService() {
		super();
	}

	public void addAniaml(Animal animal) {
		tableauAnimal.add(animal);
	}

	public void feteAnniversaire() {

		for (int i = 0; i < tableauAnimal.size(); i++) {
			Animal findAnimal = tableauAnimal.get(i);
	
				findAnimal.viellir();
				

		}
	}

	public ArrayList<Animal> findallAnimal() {
		return tableauAnimal;
	}

	@Override
	public String toString() {
		return "AnimalService [tableauAnimals=" + tableauAnimal + "]";
	}

}
