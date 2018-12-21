package it.isisgallarate.introduzione;


public class CloneImpVsAssigmentObjects {
	
	static class Person implements Cloneable {
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

		@Override
		protected Person clone() {
			return new Person(this.getName());
		}
			
	}

	public static void main(String[] args) {
		
		Person pA = new Person("MARIO");
		
		Person pB = pA;
		
		Person pC = pA.clone();
		
		System.out.println("pA.name: " + pA.getName());
		System.out.println("pB.name: " + pB.getName());
		System.out.println("pC.name: " + pC.getName());
		pA.setName("PIPPO");
		
		System.out.println("CAMBIO IL VALORE pA.name='PIPPO'");
		
		System.out.println("pA.name: " + pA.getName());
		System.out.println("pB.name: " + pB.getName());
		System.out.println("pC.name: " + pC.getName());
	}

}
