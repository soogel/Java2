
public class Duck extends Bird 
implements Flyable, Omnivore, CarnivoreEatable {
	
	
	public void eat (Eatable eatable ){
		System.out.println("Eating: "+eatable.getClass().getSimpleName() );
		if (eatable instanceof Grass){
			System.out.println("Hmm lecker Grass");
		}
		
		
	}
	public void fly() {
		System.out.println("Flying quak");
	}

	public Duck(String name, int age){
		/*setName(name);
		setAge(age);*/
		super (name, age);
	}
	
	
		
	public void eat(){
		System.out.println(getName()+" delicous quak");
		
	}
	
	
	
	public static  String SPECIES_DESCRIPTION = "When I se  a bird that walks like a duck"
			+ " and swims like a duck and quacks like a duck, In call that bird a duck."
			+ " ~~ James Whitcomb Riley";
	
	public static  void printSpeciesDescription() {
		System.out.println(SPECIES_DESCRIPTION);
	}
	@Override
	public void makeNoise() {
		System.out.println("QUUAARCK");
		
	}
	
	
	
	}