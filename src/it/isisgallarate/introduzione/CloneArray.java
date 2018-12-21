package it.isisgallarate.introduzione;

import java.util.Arrays;


class Persona {
	private String name;
	
	Persona(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Persona {name: " + name + "}";
	}

}

public class CloneArray {
	
	public static void main(String[] args) {
		
		Persona[] arrPeopleA = { new Persona("Mario"), new Persona("Lucia"), new Persona("Andrea")};
		
		Persona[] arrPeopleB = arrPeopleA;
		
		Persona[] arrPeopleC = arrPeopleA.clone();
		
		System.out.println("arrPersonsA: " + arrPeopleA);
		System.out.println("arrPersonsB: " + arrPeopleB);
		System.out.println("arrPersonsC: " + arrPeopleC); // different
		
		System.out.println("arrPersonsA: " + Arrays.toString(arrPeopleA));
		System.out.println("arrPersonsB: " + Arrays.toString(arrPeopleB));
		System.out.println("arrPersonsC: " + Arrays.toString(arrPeopleC)); 
		
		// 
		Persona pA = arrPeopleA[0];
		
		pA.setName("Maria");
		
		System.out.println("------------ DOPO MODIFICA UN ELEMENTO -----------------");
		
		System.out.println("arrPersonsA: " + Arrays.toString(arrPeopleA));
		System.out.println("arrPersonsB: " + Arrays.toString(arrPeopleB));
		System.out.println("arrPersonsC: " + Arrays.toString(arrPeopleC)); 
		
		System.out.println("------------- DOPO ASSEGNAMENTO UN ELEMENTO -------------");
		
		arrPeopleA[0] = new Persona("Luca"); 
				
		System.out.println("arrPersonsA: " + Arrays.toString(arrPeopleA));
		System.out.println("arrPersonsB: " + Arrays.toString(arrPeopleB));
		System.out.println("arrPersonsC: " + Arrays.toString(arrPeopleC)); 
		
		
	}

}
