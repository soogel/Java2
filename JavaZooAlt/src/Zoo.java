


public class Zoo {

	
	Animal [] animals = new Animal [1000];
		
		
		
		/*Duck[] ducks = new Duck[100];
		Ostrich[] ostrichs= new Ostrich[50];
		Hummingbird[] hummingbirds= new Hummingbird[200];
		*/
	
		//ausgeklammert
		//freddy.sayName();
		//freddy.layEggs();
		//freddy.flapWings(1);
		//freddy.move();
		//freddy.fly();
		//freddy.eat();
		//Duck.printSpeciesDescription();
		//Duck.SPECIES_DESCRIPTION = "TEST";
		//Duck.printSpeciesDescription();
		//Duck.printSpeciesDescription();
		//carlos.eat();
		//horst.getAge();
		//horst.eat();
		
		public void addAllAnimals(){
			
		
			animals[0] = new Duck ("Freddy", 2 );
			animals[1] = new Duck ("Tina", 1 );
			animals[2] = new Duck ("Klara", 2 );
			animals[3] = new Duck ("Jonny", 2 );
			animals[4] = new Duck ("Mikey", 3 );
			animals[5] = new Duck ("Mindy", 3 );
			animals[6] = new Duck ("Lisa", 5 );
			animals[7] = new Duck ("Richard", 6 );
			
			animals[0] = new Ostrich ("Carlos", 12 );
			animals[1] = new Ostrich ("Clara", 10 );
			
			animals[0] = new Hummingbird ("Cindy", 2 );
			animals[1] = new Hummingbird ("Tobi", 2 );
		
			
			
		}
		
		
	public void listAllAnimals(){
		//ausgeklammert V1
		/*System.out.println(freddy.toString());
		System.out.println(tina.toString());
		System.out.println(carlos.toString());
		System.out.println(cindy.toString());
		*/
		
		//ausgeklammert v2
		/*
		System.out.println(ducks[0].toString());
		System.out.println(ducks[1].toString());
		System.out.println(ducks[2].toString());
		
		System.out.println(ostrichs[0].toString());
		System.out.println(ostrichs[1].toString());
		
		System.out.println(hummingbirds[0].toString());
		System.out.println(hummingbirds[1].toString());
		*/
		
		
		//V1
		/*for (int index=0; index < ducks.length; index++){
			Duck someDuck = ducks [index];
			if (someDuck != null ) {
				System.out.println(someDuck.toString());
			}
			
		}*/
		//V2
		for (Animal someOstrich :animals) {
			if (someOstrich != null) {
				System.out.println(someOstrich);
			}
		}
		
	}
	
	public void feedAllAnimals () {
		System.out.println("Feeding all Animals");
	}
	
	private void freeAllAnimals(){
		System.out.println("Freeing all Animals");
	}

}
