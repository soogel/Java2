
public class Ostrich extends Bird implements CarnivoreEatable, HerbivoreEatable {

	public Ostrich(String name, int age){
		super (name, age);
		/*setName(name);
		setAge(age);*/
	}
	
	
	public void eat (Eatable food ){
		System.out.println("Eating: "+ food);
	}


	@Override
	public void makeNoise() {
	System.out.println("Ostrichhhh");
	
		
	}
	
	
	
	
}
