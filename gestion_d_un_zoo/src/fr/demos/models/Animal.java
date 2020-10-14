package fr.demos.models;

public class Animal {
	private String name;
	private boolean vivant;
	private int age;
	private int ageMaxi;

	public Animal(String name, boolean vivant, int age) {
		super();
		this.name = name;
		this.vivant = vivant;
		this.age = age;
	}

	public Animal() {
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isVivant() {
		return vivant;
	}

	public void setVivant(boolean vivant) {
		this.vivant = vivant;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAgeMaxi() {
		return ageMaxi;
	}

	public void setAgeMaxi(int ageMaxi) {
		this.ageMaxi = ageMaxi;
	}
	public void viellir() {
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", vivant=" + vivant + ", age=" + age + ", ageMaxi=" + ageMaxi + "]";
	}

}
