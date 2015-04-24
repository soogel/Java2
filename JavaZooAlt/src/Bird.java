
public abstract class Bird extends Animal{
	
	
	public abstract void makeNoise();
	
	public Bird(String name, int age) {
		super(name, age);
	}



	public void flapWings(int count){
		for (int i=1; i<=count; i++){
			System.out.println(getName() +" Flap");
			
		}
		}
	
	
	
	public void layEggs(){
		System.out.println(getName() +" eggs laying");
	}
	
	
}
