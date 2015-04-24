
public class ZooTest {

	public static void main(String[] args) {

		new ZooTest().run();
	}

	/*
	 * Zoo zoo = new Zoo(); zoo.addAllAnimals(); zoo.listAllAnimals();
	 */

	// Bsp. 1
	/*
	 * Bird myBird = new Duck ("freddy", 2); myBird.eat(); myBird.sayName();
	 * myBird.flapWings(3);
	 */

	// Bsp. 2

	// Duck duck = new Duck ("Freddy", 2);
	// eatAndFlapWings(duck);

	public void run() {
		/*Zoo zoo =  new Zoo();
		zoo.addAllAnimals();
		zoo.listAllAnimals();*/
		
		/*Duck freddy = new Duck ("Freddy", 2);
		Eatable grass = new Grass(0);
		Eatable worm = new Worm ("Jimmy", 1); 
		freddy.eat(worm);
		freddy.eat(grass);*/
		
		Bird bird = new Duck ("freddy", 2);
		bird.makeNoise();
		
		bird = new Ostrich ("Carlos", 4);
		bird.makeNoise();
				
		
		// Animal animal = createRandomAnimnal();
		// animal.sayName();

	}

	public static Animal createRandomAnimnal() {
		if (Math.random() > 0.5) {
			return new Duck("Freddy", 2);
		} else {
			return new Ostrich("Carlos", 5);
		}

	}

	public static void eatAndFlapWings(Bird bird) {
		bird.eat();
		bird.flapWings(2);

	}

}
