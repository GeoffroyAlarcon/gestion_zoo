package fr.demos.main;

import fr.demos.models.Animal;
import fr.demos.models.Chien;
import fr.demos.models.Oiseau;
import fr.demos.models.Singe;
import fr.demos.services.AnimalService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalService tableauAnimal = new AnimalService();
		Singe singe1 = new Singe("bobo", true, 5);
		Chien rex = new Chien("rex", true, 77);
		Oiseau flappybird = new Oiseau("hangrybird", true, 0);
		tableauAnimal.addAnimal(singe1);
		tableauAnimal.addAnimal(rex);
		tableauAnimal.addAnimal(flappybird);
		System.out.println(tableauAnimal.findallAnimal());
		tableauAnimal.feteAnniversaire();
		System.out.println(tableauAnimal.findallAnimal());
	}

}
