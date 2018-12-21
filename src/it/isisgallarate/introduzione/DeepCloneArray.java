package it.isisgallarate.introduzione;

import java.util.Arrays;

public class DeepCloneArray {
	
	static class Person  implements Cloneable {
		private String name;
		
		Person(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String toString() {
			return "Person {name: " + name + "}";
		}
		
		@Override
		public Person clone() throws CloneNotSupportedException {
			super.clone();
			return new Person(this.getName());
		}
	}
	
	public static void main(String[] args) {
		
		Person[] arrPersonsA = { new Person("Mario"), new Person("Lucia"), new Person("Andrea")};
		
		Person[] arrPersonsB = arrPersonsA;
		
		Person[] arrPersonsC = arrPersonsA.clone();
		
		System.out.println("arrPersonsA: " + arrPersonsA);
		System.out.println("arrPersonsB: " + arrPersonsB);
		System.out.println("arrPersonsC: " + arrPersonsC); // different
		
		System.out.println("arrPersonsA; " + Arrays.toString(arrPersonsA));
		System.out.println("arrPersonsB: " + Arrays.toString(arrPersonsB));
		System.out.println("arrPersonsC: " + Arrays.toString(arrPersonsC)); 
		
		// 
		Person pA = arrPersonsA[0];
		
		pA.setName("Maria");
		
		System.out.println("------------ DOPO MODIFICA UN ELEMENTO -----------------");
		
		System.out.println("arrPersonsA: " + Arrays.toString(arrPersonsA));
		System.out.println("arrPersonsB: " + Arrays.toString(arrPersonsB));
		System.out.println("arrPersonsC: " + Arrays.toString(arrPersonsC)); 
		
		System.out.println("------------- DOPO ASSEGNAMENTO UN ELEMENTO -------------");
		
		arrPersonsA[0] = new Person("Luca"); 
				
		System.out.println("arrPersonsA: " + Arrays.toString(arrPersonsA));
		System.out.println("arrPersonsB: " + Arrays.toString(arrPersonsB));
		System.out.println("arrPersonsC: " + Arrays.toString(arrPersonsC)); 
		
		
	}

}
