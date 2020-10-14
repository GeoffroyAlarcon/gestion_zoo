package fr.demos.main;

import fr.demos.models.Animal;
import fr.demos.models.Singe;
import fr.demos.services.AnimalService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Singe singe1 = new Singe("bobo", true, 19);
		singe1.vieillir();
}

}
